package com.lowr4.movies.ui.tvshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.lowr4.movies.R
import com.lowr4.movies.databinding.FragmentTvShowBinding
import com.lowr4.movies.ui.favorite.FavoriteActivity
import com.lowr4.movies.ui.home.HomeActivity
import com.lowr4.movies.viewmodel.ViewModelFactory
import com.lowr4.movies.vo.Status

class TVShowFragment : Fragment() {
    private lateinit var binding: FragmentTvShowBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTvShowBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (activity != null) {
            val factory = ViewModelFactory.getInstance(requireActivity())
            val viewModel = ViewModelProvider(this, factory)[TvShowViewModel::class.java]
            val tvAdapter = TvShowAdapter()

            val homeActivity = HomeActivity::class.java.simpleName
            val favoriteActivity = FavoriteActivity::class.java.simpleName
            val mActivity = requireActivity().javaClass.simpleName

            if (homeActivity == mActivity){
                viewModel.getTvShows().observe(requireActivity(), { tvShow ->
                    if (tvShow != null){
                        when (tvShow.status){
                            Status.LOADING -> binding.progressBar.visibility = View.VISIBLE
                            Status.SUCCESS -> {
                                binding.progressBar.visibility = View.GONE
                                tvAdapter.submitList(tvShow.data)
                            }
                            Status.ERROR -> {
                                binding.progressBar.visibility = View.GONE
                                Toast.makeText(context, getString(R.string.kesalahan), Toast.LENGTH_SHORT).show()
                            }
                        }
                    }
                })
            } else if (favoriteActivity == mActivity){
                binding.progressBar.visibility = View.VISIBLE
                viewModel.getFavoriteTvShows().observe(requireActivity(), { tvShow ->
                    binding.progressBar.visibility = View.GONE
                    tvAdapter.submitList(tvShow)
                })
            }

            with(binding.rvTvshow) {
                this.layoutManager = LinearLayoutManager(context)
                this.setHasFixedSize(true)
                this.adapter = tvAdapter
            }
        }
    }
}
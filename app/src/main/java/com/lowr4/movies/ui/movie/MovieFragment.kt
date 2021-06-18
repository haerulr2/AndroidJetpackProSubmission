package com.lowr4.movies.ui.movie

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.lowr4.movies.R
import com.lowr4.movies.databinding.FragmentMovieBinding
import com.lowr4.movies.ui.favorite.FavoriteActivity
import com.lowr4.movies.ui.home.HomeActivity
import com.lowr4.movies.viewmodel.ViewModelFactory
import com.lowr4.movies.vo.Status

class MovieFragment : Fragment() {
    private lateinit var binding: FragmentMovieBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMovieBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (activity != null){
            val factory = ViewModelFactory.getInstance(requireActivity())
            val viewModel = ViewModelProvider(this, factory)[MovieViewModel::class.java]
            val movieAdapter = MovieAdapter()

            val homeActivity = HomeActivity::class.java.simpleName
            val favoriteActivity = FavoriteActivity::class.java.simpleName
            val mActivity = requireActivity().javaClass.simpleName

            if (homeActivity == mActivity){
                viewModel.getMovies().observe(requireActivity(), { movie ->
                    if (movie != null){
                        when (movie.status){
                            Status.LOADING -> binding.progressBar.visibility = View.VISIBLE
                            Status.SUCCESS -> {
                                binding.progressBar.visibility = View.GONE
                                movieAdapter.submitList(movie.data)
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
                viewModel.getFavoriteMovies().observe(requireActivity(), { movie ->
                    if (movie != null){
                        binding.progressBar.visibility = View.GONE
                        movieAdapter.submitList(movie)
                    }
                })
            }

            with(binding.rvMovie) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = movieAdapter
            }
        }
    }
}
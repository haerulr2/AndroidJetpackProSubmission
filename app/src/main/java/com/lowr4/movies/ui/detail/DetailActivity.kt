package com.lowr4.movies.ui.detail

import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.lowr4.movies.R
import com.lowr4.movies.data.source.local.entity.MovieEntity
import com.lowr4.movies.data.source.local.entity.TvShowEntity
import com.lowr4.movies.databinding.ActivityDetailBinding
import com.lowr4.movies.viewmodel.ViewModelFactory
import com.lowr4.movies.vo.Status

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    private lateinit var viewModel: DetailViewModel
    private var menu: Menu? = null

    companion object {
        const val MOVIE_ID = "movie_id"
        const val TV_SHOW_ID = "tv_show_id"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val factory = ViewModelFactory.getInstance(this)
        viewModel = ViewModelProvider(this, factory)[DetailViewModel::class.java]

        val movieId = intent.getStringExtra(MOVIE_ID)
        if (movieId != null){
            viewModel.setSelectedMovie(movieId)
            viewModel.movieDetail.observe(this, { movie ->
                if (movie != null){
                    when (movie.status){
                        Status.LOADING -> binding.progressBar.visibility = View.VISIBLE
                        Status.SUCCESS -> {
                            binding.progressBar.visibility = View.GONE
                            populateDetailMovie(movie.data)
                        }
                        Status.ERROR -> {
                            binding.progressBar.visibility = View.GONE
                            Toast.makeText(this, getString(R.string.kesalahan), Toast.LENGTH_SHORT).show()
                        }
                    }
                }
            })
        }

        val tvShowId = intent.getStringExtra(TV_SHOW_ID)
        if (tvShowId != null) {
            viewModel.setSelectedTvShow(tvShowId)
            viewModel.tvShowDetail.observe(this, { tvShow ->
                if (tvShow != null){
                    when (tvShow.status){
                        Status.LOADING -> binding.progressBar.visibility = View.VISIBLE
                        Status.SUCCESS -> {
                            binding.progressBar.visibility = View.GONE
                            populateDetailTvShow(tvShow.data)
                        }
                        Status.ERROR -> {
                            binding.progressBar.visibility = View.GONE
                            Toast.makeText(this, getString(R.string.kesalahan), Toast.LENGTH_SHORT).show()
                        }
                    }
                }
            })
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_detail, menu)
        this.menu = menu
        viewModel.movieDetail.observe(this, { movie ->
            if (movie != null){
                when (movie.status){
                    Status.LOADING -> binding.progressBar.visibility = View.VISIBLE
                    Status.SUCCESS -> if (movie.data != null){
                        binding.progressBar.visibility = View.GONE
                        val state = movie.data.isFavorite
                        setFavoriteState(state) }
                    Status.ERROR -> {
                        binding.progressBar.visibility = View.GONE
                        Toast.makeText(this, getString(R.string.kesalahan), Toast.LENGTH_SHORT).show()
                    }
                }
            }
        })
        viewModel.tvShowDetail.observe(this, { tvShow ->
            if (tvShow != null){
                when (tvShow.status){
                    Status.LOADING -> binding.progressBar.visibility = View.VISIBLE
                    Status.SUCCESS -> if (tvShow.data != null){
                        binding.progressBar.visibility = View.GONE
                        val state = tvShow.data.isFavorite
                        setFavoriteState(state) }
                    Status.ERROR -> {
                        binding.progressBar.visibility = View.GONE
                        Toast.makeText(this, getString(R.string.kesalahan), Toast.LENGTH_SHORT).show()
                    }
                }
            }
        })
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.set_favorite -> viewModel.setFavorite()
            android.R.id.home -> onBackPressed()
            else -> return super.onOptionsItemSelected(item)
        }
        return true
    }

    private fun setFavoriteState(state: Boolean?){
        if (menu == null) return
        val menuItem = menu?.findItem(R.id.set_favorite)
        if (state!!){
            menuItem?.icon = ContextCompat.getDrawable(this, R.drawable.ic_favorite)
        } else {
            menuItem?.icon = ContextCompat.getDrawable(this, R.drawable.ic_favorite_border)
        }
    }

    private fun populateDetailMovie(entity: MovieEntity?) {
        with(binding) {
            tvTitle.text = entity?.title
            tvCategory.text = entity?.category
            tvDuration.text = entity?.duration
            tvRelease.text = entity?.release
            tvDirector.text = entity?.director
            tvDescription.text = entity?.description

            Glide.with(this@DetailActivity)
                .load(Uri.parse(entity?.poster))
                .apply(RequestOptions.placeholderOf(R.drawable.ic_load))
                .error(R.drawable.ic_img_error)
                .into(ivPoster)
        }
        supportActionBar?.title = getString(R.string.movies)
    }

    private fun populateDetailTvShow(entity: TvShowEntity?) {
        with(binding) {
            tvTitle.text = entity?.title
            tvCategory.text = entity?.category
            tvDuration.text = entity?.duration
            tvRelease.text = entity?.episodes
            tvDirector.text = entity?.creator
            tvDescription.text = entity?.description

            Glide.with(this@DetailActivity)
                .load(Uri.parse(entity?.poster))
                .apply(RequestOptions.placeholderOf(R.drawable.ic_load))
                .error(R.drawable.ic_img_error)
                .into(ivPoster) }

            binding.release.text = resources.getString(R.string.episode)
            binding.director.text = resources.getString(R.string.creator)
            supportActionBar?.title = resources.getString(R.string.tv_shows)
    }
}
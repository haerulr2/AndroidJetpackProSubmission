package com.lowr4.movies.ui.movie

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagedListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.lowr4.movies.R
import com.lowr4.movies.data.source.local.entity.MovieEntity
import com.lowr4.movies.databinding.MovieListBinding
import com.lowr4.movies.ui.detail.DetailActivity
import com.lowr4.movies.ui.detail.DetailActivity.Companion.MOVIE_ID

class MovieAdapter: PagedListAdapter<MovieEntity, MovieAdapter.MovieViewHolder>(DIFF_CALLBACK) {
    companion object{
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<MovieEntity>(){
            override fun areItemsTheSame(oldItem: MovieEntity, newItem: MovieEntity): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: MovieEntity, newItem: MovieEntity): Boolean {
                return oldItem == newItem
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view = MovieListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieViewHolder(view)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = getItem(position)
        if (movie != null){
            holder.bind(movie)
        }
    }

    inner class MovieViewHolder(private val binding: MovieListBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(movie: MovieEntity) {
            with(binding) {
                rvTitle.text = movie.title
                rvCategory.text = movie.category
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailActivity::class.java)
                    intent.putExtra(MOVIE_ID, movie.id)
                    itemView.context.startActivity(intent)
                }
                Glide.with(itemView.context)
                    .load(Uri.parse(movie.poster))
                    .apply(RequestOptions.placeholderOf(R.drawable.ic_load))
                    .apply(RequestOptions.centerCropTransform())
                    .error(R.drawable.ic_img_error)
                    .into(rvPoster)
            }
        }
    }
}
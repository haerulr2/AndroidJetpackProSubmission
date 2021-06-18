package com.lowr4.movies.ui.tvshow

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
import com.lowr4.movies.data.source.local.entity.TvShowEntity
import com.lowr4.movies.databinding.TvShowListBinding
import com.lowr4.movies.ui.detail.DetailActivity
import com.lowr4.movies.ui.detail.DetailActivity.Companion.TV_SHOW_ID

class TvShowAdapter : PagedListAdapter<TvShowEntity, TvShowAdapter.TvShowViewHolder>(DIFF_CALLBACK) {
    companion object{
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<TvShowEntity>(){
            override fun areItemsTheSame(oldItem: TvShowEntity, newItem: TvShowEntity): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: TvShowEntity, newItem: TvShowEntity): Boolean {
                return oldItem == newItem
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TvShowViewHolder {
        val view = TvShowListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TvShowViewHolder(view)
    }

    override fun onBindViewHolder(holder: TvShowViewHolder, position: Int) {
        val tvShow = getItem(position)
        if (tvShow != null){
            holder.bind(tvShow)
        }
    }

    inner class TvShowViewHolder(private val binding: TvShowListBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(tvShow: TvShowEntity) {
            with(binding) {
                rvTitle.text = tvShow.title
                rvCategory.text = tvShow.category
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailActivity::class.java)
                    intent.putExtra(TV_SHOW_ID, tvShow.id)
                    itemView.context.startActivity(intent)
                }
                Glide.with(itemView.context)
                    .load(Uri.parse(tvShow.poster))
                    .apply(RequestOptions.placeholderOf(R.drawable.ic_load))
                    .apply(RequestOptions.centerCropTransform())
                    .error(R.drawable.ic_img_error)
                    .into(rvPoster)
            }
        }
    }
}
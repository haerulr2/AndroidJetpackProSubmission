package com.lowr4.movies.ui.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.lowr4.movies.data.AppRepository
import com.lowr4.movies.data.source.local.entity.MovieEntity
import com.lowr4.movies.data.source.local.entity.TvShowEntity
import com.lowr4.movies.vo.Resource


class DetailViewModel(private val appRepository: AppRepository) : ViewModel() {
    private val movieId = MutableLiveData<String>()
    private val tvShowId = MutableLiveData<String>()

    fun setSelectedMovie(id: String){
        this.movieId.value = id
    }

    fun setSelectedTvShow(id:String){
        this.tvShowId.value = id
    }

    var movieDetail: LiveData<Resource<MovieEntity>> = Transformations.switchMap(movieId){ mId ->
        appRepository.getDetailMovie(mId)
    }

    var tvShowDetail: LiveData<Resource<TvShowEntity>> = Transformations.switchMap(tvShowId){ mId ->
        appRepository.getDetailTvShow(mId)
    }

    fun setFavorite(){
        val movie = movieDetail.value
        val tvShow = tvShowDetail.value

        if (movie != null){
            val movieEntity = movie.data
            if (movieEntity != null){
                val state = !movieEntity.isFavorite
                appRepository.setFavoriteMovie(movieEntity, state)
            }
        } else if (tvShow != null){
            val tvShowEntity = tvShow.data
            if (tvShowEntity != null){
                val state = !tvShowEntity.isFavorite
                appRepository.setFavoriteTvShow(tvShowEntity, state)
            }
        }
    }
}
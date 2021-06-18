package com.lowr4.movies.data

import androidx.lifecycle.LiveData
import androidx.paging.PagedList
import com.lowr4.movies.data.source.local.entity.MovieEntity
import com.lowr4.movies.data.source.local.entity.TvShowEntity
import com.lowr4.movies.vo.Resource

interface AppDataSource {

    fun getMovies(): LiveData<Resource<PagedList<MovieEntity>>>

    fun getTvShows(): LiveData<Resource<PagedList<TvShowEntity>>>

    fun getFavoriteMovies(): LiveData<PagedList<MovieEntity>>

    fun getFavoriteTvShows(): LiveData<PagedList<TvShowEntity>>

    fun setFavoriteMovie(movie: MovieEntity, state: Boolean)

    fun setFavoriteTvShow(tvShow: TvShowEntity, state: Boolean)

    fun getDetailMovie(id: String): LiveData<Resource<MovieEntity>>

    fun getDetailTvShow(id: String): LiveData<Resource<TvShowEntity>>
}
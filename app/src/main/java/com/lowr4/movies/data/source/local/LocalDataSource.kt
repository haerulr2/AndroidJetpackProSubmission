package com.lowr4.movies.data.source.local

import androidx.lifecycle.LiveData
import androidx.paging.DataSource
import com.lowr4.movies.data.source.local.entity.MovieEntity
import com.lowr4.movies.data.source.local.entity.TvShowEntity
import com.lowr4.movies.data.source.local.room.AppDao

class LocalDataSource private constructor(private val mAppDao: AppDao){

    companion object{
        private var INSTANCE: LocalDataSource? = null

        fun getInstance(appDao: AppDao): LocalDataSource =
            INSTANCE?: LocalDataSource(appDao)
    }

    fun getMovies(): DataSource.Factory<Int, MovieEntity> = mAppDao.getMovies()

    fun getTvShows(): DataSource.Factory<Int, TvShowEntity> = mAppDao.getTvShows()

    fun getMovieById(id: String): LiveData<MovieEntity> = mAppDao.getMovieById(id)

    fun getTvShowById(id: String): LiveData<TvShowEntity> = mAppDao.getTvShowById(id)

    fun getFavoriteMovie(): DataSource.Factory<Int, MovieEntity> = mAppDao.getFavoriteMovies()

    fun getFavoriteTvShow(): DataSource.Factory<Int, TvShowEntity> = mAppDao.getFavoriteTvShow()

    fun insertMovies(movies: List<MovieEntity>) = mAppDao.insertMovies(movies)

    fun insertTvShows(tvShows: List<TvShowEntity>) = mAppDao.insertTvShow(tvShows)

    fun setFavoriteMovie(movie: MovieEntity, newState: Boolean){
        movie.isFavorite = newState
        mAppDao.updateMovie(movie)
    }

    fun setFavoriteTvShow(tvShow: TvShowEntity, newState: Boolean){
        tvShow.isFavorite = newState
        mAppDao.updateTvShow(tvShow)
    }
}
package com.lowr4.movies.data.source.local.room

import androidx.lifecycle.LiveData
import androidx.paging.DataSource
import androidx.room.*
import com.lowr4.movies.data.source.local.entity.MovieEntity
import com.lowr4.movies.data.source.local.entity.TvShowEntity

@Dao
interface AppDao {

    @Query("SELECT * FROM movieentities")
    fun getMovies(): DataSource.Factory<Int, MovieEntity>

    @Query("SELECT * FROM tvshowentities")
    fun getTvShows(): DataSource.Factory<Int, TvShowEntity>

    @Query("SELECT * FROM movieentities WHERE id = :id")
    fun getMovieById(id: String): LiveData<MovieEntity>

    @Query("SELECT * FROM tvshowentities WHERE id = :id")
    fun getTvShowById(id: String): LiveData<TvShowEntity>

    @Query("SELECT * FROM movieentities WHERE isFavorite = 1")
    fun getFavoriteMovies(): DataSource.Factory<Int, MovieEntity>

    @Query("SELECT * FROM tvshowentities WHERE isFavorite = 1")
    fun getFavoriteTvShow(): DataSource.Factory<Int, TvShowEntity>

    @Insert(entity = MovieEntity::class, onConflict = OnConflictStrategy.REPLACE)
    fun insertMovies(movies: List<MovieEntity>)

    @Insert(entity = TvShowEntity::class, onConflict = OnConflictStrategy.REPLACE)
    fun insertTvShow(tvShows: List<TvShowEntity>)

    @Update
    fun updateMovie(movie: MovieEntity)

    @Update
    fun updateTvShow(tvShow: TvShowEntity)
}
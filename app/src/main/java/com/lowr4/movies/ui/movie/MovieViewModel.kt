package com.lowr4.movies.ui.movie

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.paging.PagedList
import com.lowr4.movies.data.AppRepository
import com.lowr4.movies.data.source.local.entity.MovieEntity
import com.lowr4.movies.vo.Resource

class MovieViewModel(private val appRepository: AppRepository) : ViewModel() {

    fun getMovies() : LiveData<Resource<PagedList<MovieEntity>>> = appRepository.getMovies()

    fun getFavoriteMovies(): LiveData<PagedList<MovieEntity>> = appRepository.getFavoriteMovies()

}
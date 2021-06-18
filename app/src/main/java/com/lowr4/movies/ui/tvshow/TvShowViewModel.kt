package com.lowr4.movies.ui.tvshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.paging.PagedList
import com.lowr4.movies.data.AppRepository
import com.lowr4.movies.data.source.local.entity.TvShowEntity
import com.lowr4.movies.vo.Resource

class TvShowViewModel(private val appRepository: AppRepository) : ViewModel() {

    fun getTvShows() : LiveData<Resource<PagedList<TvShowEntity>>> = appRepository.getTvShows()

    fun getFavoriteTvShows(): LiveData<PagedList<TvShowEntity>> = appRepository.getFavoriteTvShows()
}
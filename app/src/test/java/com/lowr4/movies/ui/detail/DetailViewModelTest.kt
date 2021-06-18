package com.lowr4.movies.ui.detail

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import com.lowr4.movies.data.AppRepository
import com.lowr4.movies.data.source.local.entity.MovieEntity
import com.lowr4.movies.data.source.local.entity.TvShowEntity
import com.lowr4.movies.utils.DataDummy
import com.lowr4.movies.utils.LiveDataTestUtil
import com.lowr4.movies.vo.Resource
import com.nhaarman.mockitokotlin2.verify
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class DetailViewModelTest {

    private lateinit var viewModel: DetailViewModel
    private val dummyMovie = DataDummy.generateDummyMovie()[0]
    private val dummyTvShow = DataDummy.generateDummyTvShow()[0]
    private val movieId = dummyMovie.id
    private val tvShowId = dummyTvShow.id

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var appRepository: AppRepository

    @Before
    fun setup(){
        viewModel = DetailViewModel(appRepository)
        viewModel.setSelectedMovie(movieId)
        viewModel.setSelectedTvShow(tvShowId)

    }

    @Test
    fun getDetailMovie() {
        val dummyMovie = MutableLiveData<Resource<MovieEntity>>()
        dummyMovie.value = Resource.success(DataDummy.generateDummyMovieById(movieId))
        `when`(appRepository.getDetailMovie(movieId)).thenReturn(dummyMovie)

        val movieEntities = LiveDataTestUtil.getValue(appRepository.getDetailMovie(movieId))
        verify(appRepository).getDetailMovie(movieId)
        assertNotNull(movieEntities.data)
        assertEquals("m0", movieEntities.data?.id)
    }

    @Test
    fun getDetailTvShow() {
        val dummyTvShow = MutableLiveData<Resource<TvShowEntity>>()
        dummyTvShow.value = Resource.success(DataDummy.generateDummyTvShowById(tvShowId))
        `when`(appRepository.getDetailTvShow(tvShowId)).thenReturn(dummyTvShow)

        val tvShowEntities = LiveDataTestUtil.getValue(appRepository.getDetailTvShow(tvShowId))
        verify(appRepository).getDetailTvShow(tvShowId)
        assertNotNull(tvShowEntities.data)
        assertEquals("t0", tvShowEntities.data?.id)
    }
}
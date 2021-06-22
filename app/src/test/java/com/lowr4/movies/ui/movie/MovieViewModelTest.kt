package com.lowr4.movies.ui.movie

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.paging.PagedList
import com.lowr4.movies.data.AppRepository
import com.lowr4.movies.data.source.local.entity.MovieEntity
import com.lowr4.movies.vo.Resource
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.Mockito.verify
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class MovieViewModelTest {

    private lateinit var viewModel: MovieViewModel

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var appRepository: AppRepository

    @Mock
    private lateinit var observer: Observer<Resource<PagedList<MovieEntity>>>

    @Mock
    private lateinit var observerFavorite: Observer<PagedList<MovieEntity>>

    @Mock
    private lateinit var pagedList: PagedList<MovieEntity>

    @Before
    fun setup(){
        viewModel = MovieViewModel(appRepository)
    }

    @Test
    fun getMovie(){
        val dummyMovie = Resource.success(pagedList)
        `when`(dummyMovie.data?.size).thenReturn(17)
        val movie = MutableLiveData<Resource<PagedList<MovieEntity>>>()
        movie.value = dummyMovie

        `when`(appRepository.getMovies()).thenReturn(movie)
        val movieEntities = viewModel.getMovies().value?.data
        verify(appRepository).getMovies()
        assertNotNull(movieEntities)
        assertEquals(17, movieEntities?.size)

        viewModel.getMovies().observeForever(observer)
        verify(observer).onChanged(dummyMovie)
    }

    @Test
    fun getFavoriteMovie(){
        val dummyFavorite = pagedList
        `when`(dummyFavorite.size).thenReturn(5)
        val movie = MutableLiveData<PagedList<MovieEntity>>()
        movie.value = dummyFavorite

        `when`(appRepository.getFavoriteMovies()).thenReturn(movie)
        val movieEntities = viewModel.getFavoriteMovies().value
        verify(appRepository).getFavoriteMovies()
        assertNotNull(movieEntities)
        assertEquals(5, movieEntities?.size)

        viewModel.getFavoriteMovies().observeForever(observerFavorite)
        verify(observerFavorite).onChanged(dummyFavorite)
    }
}
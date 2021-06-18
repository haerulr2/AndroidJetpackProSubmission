package com.lowr4.movies.data.source

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.paging.DataSource
import com.lowr4.movies.data.source.local.LocalDataSource
import com.lowr4.movies.data.source.local.entity.MovieEntity
import com.lowr4.movies.data.source.local.entity.TvShowEntity
import com.lowr4.movies.data.source.remote.RemoteDataSource
import com.lowr4.movies.utils.AppExecutors
import com.lowr4.movies.utils.DataDummy
import com.lowr4.movies.utils.LiveDataTestUtil
import com.lowr4.movies.utils.PagedListUtil
import com.lowr4.movies.vo.Resource
import com.nhaarman.mockitokotlin2.verify
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Rule
import org.junit.Test
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock

class AppRepositoryTest {

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    private val remote = mock(RemoteDataSource::class.java)
    private val local = mock(LocalDataSource::class.java)
    private val appExecutors = mock(AppExecutors::class.java)

    private val appRepository = FakeAppRepository(remote, local, appExecutors)

    private val movieResponse = DataDummy.generateRemoteDummyMovie()
    private val tvShowResponse = DataDummy.generateRemoteDummyTvShow()
    private val movieId = movieResponse[0].id
    private val tvShowId = tvShowResponse[0].id

    @Test
    fun getMovies() {
        val dataSourceFactory = mock(DataSource.Factory::class.java) as DataSource.Factory<Int, MovieEntity>
        `when`(local.getMovies()).thenReturn(dataSourceFactory)
        appRepository.getMovies()

        val movieEntities = Resource.success(PagedListUtil.mockPagedList(DataDummy.generateDummyMovie()))
        verify(local).getMovies()
        assertNotNull(movieEntities.data)
        assertEquals(movieResponse.size.toLong(), movieEntities.data?.size?.toLong())
    }

    @Test
    fun getTvShow() {
        val dataSourceFactory = mock(DataSource.Factory::class.java) as DataSource.Factory<Int, TvShowEntity>
        `when`(local.getTvShows()).thenReturn(dataSourceFactory)
        appRepository.getTvShows()

        val tvShowEntities = Resource.success(PagedListUtil.mockPagedList(DataDummy.generateDummyTvShow()))
        verify(local).getTvShows()
        assertNotNull(tvShowEntities)
        assertEquals(tvShowResponse.size.toLong(), tvShowEntities.data?.size?.toLong())
    }

    @Test
    fun getMovieById(){
        val dummyMovie = MutableLiveData<MovieEntity>()
        dummyMovie.value = DataDummy.generateDummyMovieById(movieId)
        `when`(local.getMovieById(movieId)).thenReturn(dummyMovie)

        val movieEntities = LiveDataTestUtil.getValue(appRepository.getDetailMovie(movieId))
        verify(local).getMovieById(movieId)
        assertNotNull(movieEntities.data)
        assertEquals(movieResponse[0].id, movieEntities.data?.id)
    }

    @Test
    fun getTvShowById(){
        val dummyTvShow = MutableLiveData<TvShowEntity>()
        dummyTvShow.value = DataDummy.generateDummyTvShowById(tvShowId)
        `when`(local.getTvShowById(tvShowId)).thenReturn(dummyTvShow)

        val tvShowEntities = LiveDataTestUtil.getValue(appRepository.getDetailTvShow(tvShowId))
        verify(local).getTvShowById(tvShowId)
        assertNotNull(tvShowEntities.data)
        assertEquals(tvShowResponse[0].id, tvShowEntities.data?.id)
    }

    @Test
    fun getFavoriteMovie(){
        val dataSourceFactory = mock(DataSource.Factory::class.java) as DataSource.Factory<Int, MovieEntity>
        `when`(local.getFavoriteMovie()).thenReturn(dataSourceFactory)
        appRepository.getFavoriteMovies()

        val movieEntities = Resource.success(PagedListUtil.mockPagedList(DataDummy.generateDummyMovie()))
        verify(local).getFavoriteMovie()
        assertNotNull(movieEntities)
        assertEquals(movieResponse.size.toLong(), movieEntities.data?.size?.toLong())
    }

    @Test
    fun getFavoriteTvShow(){
        val dataSourceFactory = mock(DataSource.Factory::class.java) as DataSource.Factory<Int, TvShowEntity>
        `when`(local.getFavoriteTvShow()).thenReturn(dataSourceFactory)
        appRepository.getFavoriteTvShows()

        val tvShowEntities = Resource.success(PagedListUtil.mockPagedList(DataDummy.generateDummyTvShow()))
        verify(local).getFavoriteTvShow()
        assertNotNull(tvShowEntities)
        assertEquals(tvShowResponse.size.toLong(), tvShowEntities.data?.size?.toLong())
    }
}
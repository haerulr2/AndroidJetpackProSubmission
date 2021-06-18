package com.lowr4.movies.data

import androidx.lifecycle.LiveData
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import com.lowr4.movies.data.source.local.LocalDataSource
import com.lowr4.movies.data.source.local.entity.MovieEntity
import com.lowr4.movies.data.source.local.entity.TvShowEntity
import com.lowr4.movies.data.source.remote.ApiResponse
import com.lowr4.movies.data.source.remote.RemoteDataSource
import com.lowr4.movies.data.source.remote.response.MovieResponse
import com.lowr4.movies.data.source.remote.response.TvShowResponse
import com.lowr4.movies.utils.AppExecutors
import com.lowr4.movies.vo.Resource

class AppRepository private constructor(
    private val remoteDataSource: RemoteDataSource,
    private val localDataSource: LocalDataSource,
    private val appExecutors: AppExecutors
    ): AppDataSource {

    companion object{
        private var instance: AppRepository? = null

        fun getInstance(remoteData: RemoteDataSource, localData: LocalDataSource, executors: AppExecutors): AppRepository =
            instance ?: synchronized(this){
                instance ?: AppRepository(remoteData, localData, executors).apply { instance = this }
            }
    }

    override fun getMovies(): LiveData<Resource<PagedList<MovieEntity>>> {
        return object: NetworkBoundResource<PagedList<MovieEntity>, List<MovieResponse>>(appExecutors){
            override fun loadFromDB(): LiveData<PagedList<MovieEntity>> {
                val config = PagedList.Config.Builder()
                    .setEnablePlaceholders(false)
                    .setInitialLoadSizeHint(2)
                    .setPageSize(10)
                    .build()
                return LivePagedListBuilder(localDataSource.getMovies(), config).build()
            }

            override fun shouldFetch(data: PagedList<MovieEntity>?): Boolean =
                data == null || data.isEmpty()

            override fun createCall(): LiveData<ApiResponse<List<MovieResponse>>> =
                remoteDataSource.getMovie()

            override fun saveCallResult(data: List<MovieResponse>) {
                val movieList = ArrayList<MovieEntity>()
                for (response in data){
                    val movie = MovieEntity(
                        response.id,
                        response.title,
                        response.category,
                        response.duration,
                        response.release,
                        response.director,
                        response.poster,
                        response.description,
                        false
                    )
                    movieList.add(movie)
                }
                localDataSource.insertMovies(movieList)
            }
        }.asLiveData()
    }

    override fun getTvShows(): LiveData<Resource<PagedList<TvShowEntity>>> {
        return object: NetworkBoundResource<PagedList<TvShowEntity>, List<TvShowResponse>>(appExecutors){
            override fun loadFromDB(): LiveData<PagedList<TvShowEntity>> {
                val config = PagedList.Config.Builder()
                    .setEnablePlaceholders(false)
                    .setInitialLoadSizeHint(2)
                    .setPageSize(10)
                    .build()
                return LivePagedListBuilder(localDataSource.getTvShows(), config).build()
            }

            override fun shouldFetch(data: PagedList<TvShowEntity>?): Boolean =
                data == null || data.isEmpty()

            override fun createCall(): LiveData<ApiResponse<List<TvShowResponse>>> =
                remoteDataSource.getTvShow()

            override fun saveCallResult(data: List<TvShowResponse>) {
                val tvShowList = ArrayList<TvShowEntity>()
                for (response in data){
                    val tvShow = TvShowEntity(
                        response.id,
                        response.title,
                        response.category,
                        response.duration,
                        response.episode,
                        response.creator,
                        response.poster,
                        response.description,
                        false
                    )
                    tvShowList.add(tvShow)
                }
                localDataSource.insertTvShows(tvShowList)
            }
        }.asLiveData()
    }

    override fun getFavoriteMovies(): LiveData<PagedList<MovieEntity>> {
        val config = PagedList.Config.Builder()
            .setEnablePlaceholders(false)
            .setInitialLoadSizeHint(2)
            .setPageSize(10)
            .build()
        return LivePagedListBuilder(localDataSource.getFavoriteMovie(), config).build()
    }

    override fun getFavoriteTvShows(): LiveData<PagedList<TvShowEntity>> {
        val config = PagedList.Config.Builder()
            .setEnablePlaceholders(false)
            .setInitialLoadSizeHint(2)
            .setPageSize(10)
            .build()
        return LivePagedListBuilder(localDataSource.getFavoriteTvShow(), config).build()
    }

    override fun setFavoriteMovie(movie: MovieEntity, state: Boolean) =
        appExecutors.diskIO().execute { localDataSource.setFavoriteMovie(movie, state) }

    override fun setFavoriteTvShow(tvShow: TvShowEntity, state: Boolean) =
        appExecutors.diskIO().execute { localDataSource.setFavoriteTvShow(tvShow, state) }

    override fun getDetailMovie(id: String): LiveData<Resource<MovieEntity>> {
        return object: NetworkBoundResource<MovieEntity, List<MovieResponse>>(appExecutors){
            override fun loadFromDB(): LiveData<MovieEntity> =
                localDataSource.getMovieById(id)

            override fun shouldFetch(data: MovieEntity?): Boolean =
                data?.id == null || data.id.isEmpty()

            override fun createCall(): LiveData<ApiResponse<List<MovieResponse>>> =
                remoteDataSource.getMovieById(id)

            override fun saveCallResult(data: List<MovieResponse>) {
                val movieList = ArrayList<MovieEntity>()
                for (response in data){

                    val movie = MovieEntity(
                        response.id,
                        response.title,
                        response.category,
                        response.duration,
                        response.release,
                        response.director,
                        response.poster,
                        response.description,
                        false
                    )
                    movieList.add(movie)
                }
                localDataSource.insertMovies(movieList)
            }
        }.asLiveData()
    }

    override fun getDetailTvShow(id: String): LiveData<Resource<TvShowEntity>> {
        return object: NetworkBoundResource<TvShowEntity, List<TvShowResponse>>(appExecutors){
            override fun loadFromDB(): LiveData<TvShowEntity> =
                localDataSource.getTvShowById(id)

            override fun shouldFetch(data: TvShowEntity?): Boolean =
                data?.id == null || data.id.isEmpty()

            override fun createCall(): LiveData<ApiResponse<List<TvShowResponse>>> =
                remoteDataSource.getTvShowById(id)

            override fun saveCallResult(data: List<TvShowResponse>) {
                val tvShowList = ArrayList<TvShowEntity>()
                for (response in data){
                    val tvShow = TvShowEntity(
                        response.id,
                        response.title,
                        response.category,
                        response.duration,
                        response.episode,
                        response.creator,
                        response.poster,
                        response.description,
                        false
                    )
                    tvShowList.add(tvShow)
                }
                localDataSource.insertTvShows(tvShowList)
            }
        }.asLiveData()
    }
}
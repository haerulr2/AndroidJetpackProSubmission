package com.lowr4.movies.di

import android.content.Context
import com.lowr4.movies.data.AppRepository
import com.lowr4.movies.data.source.local.LocalDataSource
import com.lowr4.movies.data.source.local.room.AppDatabase
import com.lowr4.movies.data.source.remote.RemoteDataSource
import com.lowr4.movies.utils.AppExecutors
import com.lowr4.movies.utils.JsonHelper

object Injection {
    fun provideRepository(context: Context): AppRepository {
        val database = AppDatabase.getInstance(context)
        val remoteDataSource = RemoteDataSource.getInstance(JsonHelper(context))
        val localDataSource = LocalDataSource.getInstance(database.appDao())
        val appExecutors = AppExecutors()

        return AppRepository.getInstance(remoteDataSource, localDataSource, appExecutors)
    }
}
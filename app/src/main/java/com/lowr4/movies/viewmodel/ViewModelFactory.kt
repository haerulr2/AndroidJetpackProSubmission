package com.lowr4.movies.viewmodel

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.lowr4.movies.data.AppRepository
import com.lowr4.movies.di.Injection
import com.lowr4.movies.ui.detail.DetailViewModel
import com.lowr4.movies.ui.movie.MovieViewModel
import com.lowr4.movies.ui.tvshow.TvShowViewModel

class ViewModelFactory private constructor(private val mAppRepository: AppRepository): ViewModelProvider.NewInstanceFactory() {

    companion object{
        private var instance: ViewModelFactory? = null

        fun getInstance(context: Context): ViewModelFactory =
            instance ?: synchronized(this){
                instance ?: ViewModelFactory(Injection.provideRepository(context))
            }
    }

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        when {
            modelClass.isAssignableFrom(MovieViewModel::class.java) -> {
                return MovieViewModel(mAppRepository) as T
            }
            modelClass.isAssignableFrom(TvShowViewModel::class.java) -> {
                return TvShowViewModel(mAppRepository) as T
            }
            modelClass.isAssignableFrom(DetailViewModel::class.java) -> {
                return DetailViewModel(mAppRepository) as T
            }
            else -> throw Throwable("Unknown ViewModel class: "+ modelClass.name)
        }
    }
}
package com.lowr4.movies.data.source.local.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.lowr4.movies.data.source.local.entity.MovieEntity
import com.lowr4.movies.data.source.local.entity.TvShowEntity

@Database(entities = [ MovieEntity::class, TvShowEntity::class], version = 1, exportSchema = false)
abstract class AppDatabase: RoomDatabase() {
    abstract fun appDao(): AppDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase =
            INSTANCE?: synchronized(this){
                Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "CatalogMovies.db"
                ).build().apply { INSTANCE = this }
            }
    }
}
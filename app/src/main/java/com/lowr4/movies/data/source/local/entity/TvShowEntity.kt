package com.lowr4.movies.data.source.local.entity

import android.os.Parcelable
import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "tvshowentities")
data class TvShowEntity(
        @PrimaryKey
        @NonNull
        @ColumnInfo(name = "id")
        var id: String,

        @ColumnInfo(name = "title")
        var title: String,

        @ColumnInfo(name = "category")
        var category: String,

        @ColumnInfo(name = "duration")
        var duration: String,

        @ColumnInfo(name = "episodes")
        var episodes: String,

        @ColumnInfo(name = "creator")
        var creator: String,

        @ColumnInfo(name = "poster")
        var poster: String,

        @ColumnInfo(name = "description")
        var description: String,

        @ColumnInfo(name = "isFavorite")
        var isFavorite: Boolean = false
) : Parcelable
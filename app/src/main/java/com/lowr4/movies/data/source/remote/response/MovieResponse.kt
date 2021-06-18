package com.lowr4.movies.data.source.remote.response

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class MovieResponse (
    var id: String,
    var title: String,
    var category: String,
    var duration: String,
    var release: String,
    var director: String,
    var poster: String,
    var description: String
) : Parcelable
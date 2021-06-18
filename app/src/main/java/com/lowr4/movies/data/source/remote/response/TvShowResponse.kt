package com.lowr4.movies.data.source.remote.response

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class TvShowResponse(
    var id: String,
    var title: String,
    var category: String,
    var duration: String,
    var episode: String,
    var creator: String,
    var poster: String,
    var description: String
): Parcelable

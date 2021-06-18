package com.lowr4.movies.utils

import android.content.Context
import com.lowr4.movies.data.source.remote.response.MovieResponse
import com.lowr4.movies.data.source.remote.response.TvShowResponse
import org.json.JSONException
import org.json.JSONObject
import java.io.IOException

class JsonHelper(private val context: Context) {

    private fun parsingFileToString(fileName: String): String? {
        return try {
            val `is` = context.assets.open(fileName)
            val buffer = ByteArray(`is`.available())
            `is`.read(buffer)
            `is`.close()
            String(buffer)
        } catch (e: IOException){
            e.printStackTrace()
            null
        }
    }

    fun loadMovie(): List<MovieResponse>{
        val list = ArrayList<MovieResponse>()
        try {
            val responseObject = JSONObject(parsingFileToString("movies.json").toString())
            val listArray = responseObject.getJSONArray("movies")
            for (i in 0 until listArray.length()){
                val movie = listArray.getJSONObject(i)

                val id = movie.getString("id")
                val title = movie.getString("title")
                val category = movie.getString("category")
                val duration = movie.getString("duration")
                val release = movie.getString("release")
                val director = movie.getString("director")
                val description = movie.getString("overview")
                val poster = movie.getString("poster")

                val movieResponse = MovieResponse(id, title, category, duration, release, director, poster, description)
                list.add(movieResponse)
            }
        } catch (e: JSONException){
            e.printStackTrace()
        }
        return list
    }

    fun loadTvShow(): List<TvShowResponse>{
        val list = ArrayList<TvShowResponse>()
        try {
            val responseObject = JSONObject(parsingFileToString("tv_shows.json").toString())
            val listArray = responseObject.getJSONArray("tv-shows")
            for (i in 0 until listArray.length()){
                val tvShow = listArray.getJSONObject(i)

                val id = tvShow.getString("id")
                val title = tvShow.getString("title")
                val category = tvShow.getString("category")
                val duration = tvShow.getString("duration")
                val episodes = tvShow.getString("episodes")
                val creator = tvShow.getString("creator")
                val description = tvShow.getString("overview")
                val poster = tvShow.getString("poster")

                val tvShowResponse = TvShowResponse(id, title, category, duration, episodes, creator, poster, description)
                list.add(tvShowResponse)
            }
        } catch (e: JSONException){
            e.printStackTrace()
        }
        return list
    }

    fun loadMovieById(movieId:String): List<MovieResponse>{
        val fileName = String.format("movies.json", movieId)
        val list = ArrayList<MovieResponse>()

        try {
            val result = parsingFileToString(fileName)
            if (result != null){
                val responseObject = JSONObject(result)
                val listArray = responseObject.getJSONArray("movies")
                for (i in 0 until listArray.length()){
                    val movie = listArray.getJSONObject(i)

                    val id = movie.getString("id")
                    val title = movie.getString("title")
                    val category = movie.getString("category")
                    val duration = movie.getString("duration")
                    val release = movie.getString("release")
                    val director = movie.getString("director")
                    val description = movie.getString("overview")
                    val poster = movie.getString("poster")

                    val movieResponse = MovieResponse(id, title, category, duration, release, director, poster, description)
                    list.add(movieResponse)
                }
            }
        } catch (e: JSONException){
            e.printStackTrace()
        }
        return list
    }

    fun loadTvShowById(tvShowId:String): List<TvShowResponse>{
        val fileName = String.format("tv_shows.json", tvShowId)
        val list = ArrayList<TvShowResponse>()

        try {
            val result = parsingFileToString(fileName)
            if (result != null){
                val responseObject = JSONObject(result)
                val listArray = responseObject.getJSONArray("tv_shows")
                for (i in 0 until listArray.length()){
                    val tvShow = listArray.getJSONObject(i)

                    val id = tvShow.getString("id")
                    val title = tvShow.getString("title")
                    val category = tvShow.getString("category")
                    val duration = tvShow.getString("duration")
                    val episodes = tvShow.getString("episodes")
                    val creator = tvShow.getString("creator")
                    val description = tvShow.getString("overview")
                    val poster = tvShow.getString("poster")

                    val tvShowResponse = TvShowResponse(id, title, category, duration, episodes, creator, poster, description)
                    list.add(tvShowResponse)
                }
            }
        } catch (e: JSONException){
            e.printStackTrace()
        }
        return list
    }
}
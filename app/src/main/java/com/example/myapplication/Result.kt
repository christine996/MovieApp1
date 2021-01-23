package com.example.myapplication

import com.google.gson.annotations.SerializedName

//Movies
data class Result(
    @SerializedName("releaseDate")  val adult: Boolean,
    @SerializedName("backdrop_path") val backdropPath: String,
    @SerializedName("genre_ids") val genre_ids: List<Int>,
    @SerializedName("id")    val id: Int,
    @SerializedName("original_language  ") val original_language: String,
    @SerializedName("original_title") val original_title: String,
    @SerializedName("overview")    val overview: String,
    @SerializedName("popularity")  val popularity: Double,
    @SerializedName("poster_path") val posterPath: String,
    @SerializedName("release_date") val releaseDate: String,
    @SerializedName("title")    val title: String,
    @SerializedName("video") val video: Boolean,
    @SerializedName("vote_average") val vote_average: Double,
    @SerializedName("vote_count")val vote_count: Int

//    @SerializedName("id") val id: Int,
//    @SerializedName("title") val title: String,
//    @SerializedName("overview") val overview: String,
//    @SerializedName("poster_path") val posterPath: String,
//    @SerializedName("backdrop_path") val backdropPath: String,
//    @SerializedName("vote_average") val rating: Float,
//    @SerializedName("release_date") val releaseDate: String
)
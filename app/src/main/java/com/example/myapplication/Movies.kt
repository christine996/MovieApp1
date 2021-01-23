package com.example.myapplication

import com.google.gson.annotations.SerializedName

//GetMoviesResponse
data class Movies(
//    val page: Int,
//    val results: List<Result>,
//    val total_pages: Int,
//    val total_results: Int

    @SerializedName("page") val page: Int,
    @SerializedName("results") val movies: List<Result>,
    @SerializedName("total_pages") val pages: Int,
    @SerializedName("total_results")val total_results: Int
)
package com.example.myapplication

import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.Call
interface Api {
    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String = "21d3fd73c011bff94f9ef84b4924d747",
        @Query("page") page: Int
    ): Call<Movies>
}
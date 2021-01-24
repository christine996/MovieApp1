package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Response


class MainActivity : AppCompatActivity() {
    private lateinit var popularMovies: RecyclerView
    private lateinit var popularMoviesAdapter: MoviesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // titles(Result());
        popularMovies = findViewById(R.id.popular_movies)
        popularMovies.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.HORIZONTAL,
            false
        )
        popularMoviesAdapter = MoviesAdapter(listOf())
        popularMovies.adapter = popularMoviesAdapter


        MoviesRepository.getPopularMovies(
            onSuccess = ::onPopularMoviesFetched,
            onError = ::onError)
    }


    val stringBuilder1= StringBuilder()
    
    private fun onPopularMoviesFetched(movies: List<Result>) {
//       var x="/e6SK2CAbO3ENy52UTzP3lv32peC.jpg"
//        Log.d("!!!","https://image.tmdb.org/t/p/w342${x}")
        Log.d("MainActivity", "Movies: ${movies}")

        for(movie in movies){
            Log.d("titles","titles:${movie.title}")
            stringBuilder1.append(movie.title+"\n"+movie.releaseDate)
            stringBuilder1.append("\n \n")

        }
        txtId.text = stringBuilder1;

    }

    private fun onError() {
        Toast.makeText(this, getString(R.string.error_fetch_movies), Toast.LENGTH_SHORT).show()
    }


}

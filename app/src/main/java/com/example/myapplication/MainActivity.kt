package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Response
import android.widget.ListView


class MainActivity : AppCompatActivity() {
    private lateinit var popularMovies: RecyclerView
    private lateinit var popularMoviesAdapter: MoviesAdapter
      //private lateinit var moviesListView: ListView
     //private lateinit var madaptor:Adapter
    //private val result = ArrayList<Result>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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




    private fun onPopularMoviesFetched(movies: List<Result>) {
        val stringBuilder= StringBuilder()
        Log.d("MainActivity", "Movies: ${movies}")


        for (movie in movies) {
            Log.d("titles", "titles:${movie.title}")
            stringBuilder.append(movie.title + "\n" + movie.releaseDate)
            stringBuilder.append("\n \n")

        }
        text.text = stringBuilder;
        text.setOnClickListener {
            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            intent.putExtra("movieTitle","")
            startActivity(intent)
        }
    }

    private fun onError() {
        Toast.makeText(this, getString(R.string.error_fetch_movies), Toast.LENGTH_SHORT).show()
    }

    /////////////////////////////////////trying to list title and date in list and converting view////////////

       // madaptor =  Adapter(this, movies as java.util.ArrayList<Result>)
      // val listView1 = findViewById<ListView>(R.id.listView)
//        listView1.setOnItemClickListener { parent, view, position, id ->
//
//            val intent = Intent(this@MainActivity,SecondActivity::class.java)
//                intent.putExtra("movieTitle","l")
//                startActivity(intent)
//        }

       ///////////////////////////////Retrieve data as object in list//////////////////////////////

//        val listView1=findViewById<ListView>(R.id.listView)
//        val arrayAdapter: ArrayAdapter<Result> =ArrayAdapter(
//            this, android.R.layout.simple_list_item_1,movies
//        )
//listView1.adapter=arrayAdapter
//
//listView1.setOnItemClickListener { adapterView, view, i, l ->
//                    val intent = Intent(this@MainActivity,SecondActivity::class.java)
//                intent.putExtra("movieTitle","l")
//                startActivity(intent)
//
//}

}



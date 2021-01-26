package com.example.myapplication

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

 class Adapter(internal var context: Activity, internal var movies: java.util.ArrayList<Result>):BaseAdapter() {

    private var inflater: LayoutInflater? = null

    override fun getCount():Int {
        return movies.size
    }
    override fun getItem(position:Int):Result {
        return movies.get(position)
    }
    override fun getItemId(position:Int):Long {
        return position.toLong()
    }
    override fun getView(position:Int, convertView: View, parent: ViewGroup):View {
        var itemView = convertView

        if(itemView==null){
           itemView= inflater!!.inflate(R.layout.activity_main,null)
        }else
            itemView=itemView

        val title = itemView.findViewById(R.id.title) as TextView
        val date = itemView.findViewById(R.id.date) as TextView
        val selectedMovie = movies.get(position)
        title.setText(selectedMovie.title)
        date.setText(selectedMovie.releaseDate)
        return itemView
    }

}
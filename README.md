##MovieApp

##OverView
This project aims to show list of popular movies.

##Content:
-Two activities
-An interface
-Two data classes
-Two adapters
-An object

--> Interface Api:
-Has params of URL(api_key & page) and defining type of API(GET).

--> Movies data class:
-Contains array of objects that contais movies data(Result).

--> Result data class:
-Contains all data about movies: title,overview,releaseDate....etc.

--> Adapter MoviesAdapter: (not working)
-Used to load images using glide library

 -->Adapter Adapter: (not working)
-It extends from the BaseAdapter.
-It uses LayoutInflater to convert the XML to view objects
-It has overriden methods to get size and position to be used in the main activity to show title,releaseDate and description 
when navigated to another activity.(commented code)

-->Object MoviesRepository:
-Calls api using retrofit and GsonConverterFactory to parse API JSON response.
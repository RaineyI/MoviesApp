package com.example.moviesapp

data class Film(
                  val bgPoster: Int,
                  val age: String,
                  val genres: String,
                  val star1: Int,
                  val star2: Int,
                  val star3: Int,
                  val star4: Int,
                  val star5: Int,
                  val reviews: String,
                  val title: String,
                  val min: String
                  )

fun generateFilms(): ArrayList<Film> {
    return arrayListOf(
        Film(R.drawable.poster_avengers, "13+", "Action, Adventure, Fantasy",
            R.drawable.star_icon, R.drawable.star_icon, R.drawable.star_icon, R.drawable.star_icon, R.drawable.star_icon_grey,
            "125 REVIEWS", "Avengers: End Game", "137 MIN"),

        Film(R.drawable.poster_tenet, "16+", "Actio, Sci-Fi, Thriller",
        R.drawable.star_icon, R.drawable.star_icon, R.drawable.star_icon, R.drawable.star_icon, R.drawable.star_icon,
        "98 REVIEWS", "Tenet", "97 MIN"),

        Film(R.drawable.poster_black, "13+", "Action, Adventure, Sci-Fi",
        R.drawable.star_icon, R.drawable.star_icon, R.drawable.star_icon, R.drawable.star_icon, R.drawable.star_icon_grey,
    "38 REVIEWS", "Black Widow", "102 MIN"),

        Film(R.drawable.poster_wonder, "13+", "Action, Adventure, Fantasy",
            R.drawable.star_icon, R.drawable.star_icon, R.drawable.star_icon, R.drawable.star_icon, R.drawable.star_icon,
            "74 REVIEWS", "Wonder Woman 1984", "120 MIN")
        )}
package com.example.moviesapp

data class Actor(val photo: Int, val name: String) {
}

fun generateForAvengers(): ArrayList<Actor> {
    return arrayListOf(
     Actor(R.drawable.robert, "Robert Downey Jr."),
     Actor(R.drawable.chris_ev, "Chris Evans"),
     Actor(R.drawable.mark, "Mark Ruffalo"),
     Actor(R.drawable.chris_h, "Chris Hemsworth")
    )
}
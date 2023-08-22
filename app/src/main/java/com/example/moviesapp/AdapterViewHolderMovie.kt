package com.example.moviesapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.moviesapp.databinding.ViewHolderMovieBinding

class AdapterViewHolderMovie(private val listOfFilms: ArrayList<Film>, val listener: Listener): RecyclerView.Adapter<AdapterViewHolderMovie.ViewHolderMovie>() {

    inner class ViewHolderMovie(private val binding: ViewHolderMovieBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(film: Film, listener: Listener) {
        binding.poster.setImageResource(film.bgPoster)
        binding.age.text = film.age
        binding.genre.text = film.genres
        binding.star1.setImageResource(film.star1)
        binding.star2.setImageResource(film.star2)
        binding.star3.setImageResource(film.star3)
        binding.star4.setImageResource(film.star4)
        binding.star5.setImageResource(film.star5)
        binding.reviews.text = film.reviews
        binding.movieTitle.text = film.title
        binding.min.text = film.min

        itemView.setOnClickListener {
            listener.onClick(film)
        }
    }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderMovie {
        val binding = ViewHolderMovieBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolderMovie(binding)
    }

    override fun getItemCount(): Int {
       return listOfFilms.size
    }

    override fun onBindViewHolder(holder: ViewHolderMovie, position: Int) {
        holder.bind(listOfFilms[position], listener)
    }

    interface Listener {
        fun onClick (film: Film) {
        }
    }
}



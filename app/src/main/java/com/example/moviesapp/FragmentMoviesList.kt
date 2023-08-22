package com.example.moviesapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.Toast
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.moviesapp.databinding.FragmentMoviesDetailsBinding
import com.example.moviesapp.databinding.FragmentMoviesListBinding

class FragmentMoviesList : Fragment(), AdapterViewHolderMovie.Listener {
    private lateinit var adapter: AdapterViewHolderMovie
    private val filmsArrayList = generateFilms()
    lateinit var binding: FragmentMoviesListBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMoviesListBinding.inflate(layoutInflater)

//        poster_1.setOnClickListener {
//            val details_1 = FragmentMoviesDetails()
//            parentFragmentManager.beginTransaction().apply{
//                addToBackStack(null)
//                replace(R.id.forFrag, details_1)
//                commit()
//            }
//        }

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rvFilms.layoutManager = GridLayoutManager(context, 2)
        binding.rvFilms.adapter = AdapterViewHolderMovie(filmsArrayList, this)
    }

    companion object {
        @JvmStatic
        fun newInstance() = FragmentMoviesList()
    }
    override fun onClick(film: Film) {
        //Toast.makeText(context, "Film: ${film.title}", Toast.LENGTH_SHORT).show()

        val details_1 = FragmentMoviesDetails()
            parentFragmentManager.beginTransaction().apply{
                addToBackStack(null)
                replace(R.id.forFrag, details_1)
                commit()
            }
    }
}

package com.example.moviesapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class FragmentMoviesList : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_movies_list, container, false)
        val poster_1 = view.findViewById<RelativeLayout>(R.id.bg_for_poster_1)

        poster_1.setOnClickListener {
            val details_1 = FragmentMoviesDetails()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.addToBackStack(null)
            transaction.replace(R.id.forFrag, details_1)
            transaction.commit()
        }

        return view
    }

    companion object {
        @JvmStatic
        fun newInstance() = FragmentMoviesList()
    }
}
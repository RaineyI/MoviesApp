package com.example.moviesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var forFrag: FrameLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        forFrag = findViewById(R.id.forFrag)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.forFrag, FragmentMoviesList.newInstance())
                .commit()
        }
    }
}

package com.example.moviesapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.moviesapp.databinding.ViewHolderActorBinding

class AdapterViewHolderActor(private val listOfActors: ArrayList<Actor>): RecyclerView.Adapter<AdapterViewHolderActor.ViewHolderActor>() {

    inner class ViewHolderActor(private val binding: ViewHolderActorBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(actor: Actor) {
            binding.actor.setImageResource(actor.photo)
            binding.name.text = actor.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderActor {
        val binding = ViewHolderActorBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolderActor(binding)
    }

    override fun getItemCount(): Int {
        return listOfActors.size
    }

    override fun onBindViewHolder(holder: ViewHolderActor, position: Int) {
        holder.bind(listOfActors[position])
    }
}
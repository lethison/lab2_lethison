package com.example.lab2

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lab2.databinding.Zingmp3Binding


class zingmp3(
    private val listMusics: List<music>
) : RecyclerView.Adapter<MusicViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MusicViewHolder.from(parent)

    override fun onBindViewHolder(holder: MusicViewHolder, position: Int) {
        holder.sugoi(listMusics[position])
    }

    override fun getItemCount() = listMusics.size
}
package com.example.lab2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lab2.databinding.ItemBinding

class MusicViewHolder private constructor(
    private val binding: ItemBinding
) : RecyclerView.ViewHolder(binding.root) {

    companion object {
        fun from(parent: ViewGroup): MusicViewHolder {
            val binding = ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            return MusicViewHolder(binding)
        }
    }

    fun sugoi(music: music) {
        binding.nameitem.text = music.name
        binding.namesinger.text = music.singer
    }
}



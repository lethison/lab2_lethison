package com.example.lab2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lab2.databinding.Zingmp3Binding

class add : AppCompatActivity() {
    private lateinit var binding: Zingmp3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Zingmp3Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.save.setOnClickListener {
            val name = binding.textname.text.toString()
            val singer = binding.textsinger.text.toString()

            val music = music(name,singer)
            MainActivity.abc.add(music)


            finish()
        }
    }
}
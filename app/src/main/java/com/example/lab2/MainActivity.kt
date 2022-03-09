package com.example.lab2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lab2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerview.run {
            layoutManager = LinearLayoutManager(this@MainActivity)
            setHasFixedSize(true)
            adapter = zingmp3(abc)
        }

        binding.btn.setOnClickListener {
            val intent = Intent(this@MainActivity, add::class.java)
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()
        // binding.listMusics.adapter = MusicAdapter(Musics)
        binding.recyclerview.adapter?.notifyDataSetChanged()
    }

    companion object {
        val abc = mutableListOf<music>()
    }
}
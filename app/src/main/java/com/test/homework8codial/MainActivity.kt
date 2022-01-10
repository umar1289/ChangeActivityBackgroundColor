package com.test.homework8codial

import android.content.Intent
import android.graphics.Color
import android.graphics.ColorFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.test.homework8codial.databinding.ActivityMainBinding

var color = 0

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    override fun onResume() {
        super.onResume()

        when (color) {
            0 -> {
                binding.main.setBackgroundColor(Color.parseColor("#FFFFFFFF"))
            }
            1 -> {
                binding.main.setBackgroundColor(Color.parseColor("#FF000000"))
            }
            2 -> {
                binding.main.setBackgroundColor(Color.parseColor("#FF3300A5"))
            }
            3->{
                binding.main.setBackgroundColor(Color.parseColor("#FF00FFE6"))
            }
            4->{
                binding.main.setBackgroundColor(Color.parseColor("#FFFF0000"))
            }
            5->{
                binding.main.setBackgroundColor(Color.parseColor("#FFFFEB3B"))
            }
            6->{
                binding.main.setBackgroundColor(Color.parseColor("#FF4CAF50"))
            }
            7->{
                binding.main.setBackgroundColor(Color.parseColor("#FFFF5722"))
            }
            8->{
                binding.main.setBackgroundColor(Color.parseColor("#FFFF00F2"))
            }
        }

        binding.btn.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}
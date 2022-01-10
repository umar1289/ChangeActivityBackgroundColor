package com.test.homework8codial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import com.test.homework8codial.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    override fun onResume() {
        super.onResume()

        binding.card1.setOnClickListener {
            onClick(0)
        }

        binding.card2.setOnClickListener {
            onClick(1)
        }

        binding.card3.setOnClickListener {
            onClick(2)
        }

        binding.card4.setOnClickListener {
            onClick(3)
        }

        binding.card5.setOnClickListener {
            onClick(4)
        }

        binding.card6.setOnClickListener {
            onClick(5)
        }

        binding.card7.setOnClickListener {
            onClick(6)
        }

        binding.card8.setOnClickListener {
            onClick(7)
        }

        binding.card9.setOnClickListener {
            onClick(8)
        }

    }

    private fun onClick(position: Int) {

        finish()

        when (position) {
            0 -> {
                color = 0
            }
            1 -> {
                color = 1
            }
            2 -> {
                color = 2
            }
            3 -> {
                color = 3
            }
            4 -> {
                color = 4
            }
            5 -> {
                color = 5
            }
            6 -> {
                color = 6
            }
            7 -> {
                color = 7
            }
            8 -> {
                color = 8
            }

        }

    }

}
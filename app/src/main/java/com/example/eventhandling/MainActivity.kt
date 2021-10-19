package com.example.eventhandling

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.eventhandling.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val root = binding.root
        setContentView(root)

        binding.myButton.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                binding.statusText.text = getString(R.string.button_pressed)
            }
        })

        binding.myButton.setOnLongClickListener {
            binding.statusText.text = getString(R.string.long_pressed)
            false
        }
    }
}
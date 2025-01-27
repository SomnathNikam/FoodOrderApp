package com.example.foodorder

import android.content.Intent
import android.content.pm.ActivityInfo
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodorder.databinding.ActivityStartBinding

class StartActivity : AppCompatActivity() {
    private lateinit var binding: ActivityStartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT // This line lock the Orientation of the app

//        binding.button.setBackgroundColor(Color.parseColor("#FF0000")) // Way 1 to programmatically add color
        binding.button.setBackgroundColor(Color.RED) // Way 2 to programmatically add color
        binding.button.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}
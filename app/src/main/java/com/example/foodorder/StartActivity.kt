package com.example.foodorder

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodorder.databinding.ActivityStartBinding

class StartActivity : AppCompatActivity() {
    private lateinit var binding: ActivityStartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityStartBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        requestedOrientation=ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
        binding.button.setOnClickListener {
            startActivity(Intent(this,LoginActivity::class.java))
        }
    }
}
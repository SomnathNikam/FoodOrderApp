package com.example.foodorder

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodorder.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
//
//        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE

        binding.button4.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }

        binding.textView9.setOnClickListener {
            startActivity(Intent(this,SignupActivity::class.java))
        }

    }
}
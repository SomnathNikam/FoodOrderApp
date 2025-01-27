package com.example.foodorder

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler


class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        requestedOrientation=ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
        Handler().postDelayed({
            val intent = Intent(this, StartActivity::class.java)
            startActivity(intent)
            finish()
        },3000)


    }
}
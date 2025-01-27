package com.example.foodorder

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper


class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        requestedOrientation=ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
//        Handler().postDelayed({
//            val intent = Intent(this, StartActivity::class.java)
//            startActivity(intent)
//            finish()
//        },3000)
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this,StartActivity::class.java))
            finish()
        },3000)

    }
}
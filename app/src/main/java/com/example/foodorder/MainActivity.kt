package com.example.foodorder

import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.foodorder.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        requestedOrientation=ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE

        setupChipGroup()

    }
    private fun setupChipGroup(){
        binding.Chip1.setOnCloseIconClickListener {
            binding.chipGroup.removeView(it)
            Toast.makeText(this,"Chip 1",Toast.LENGTH_LONG).show()
        }
        binding.Chip2.setOnCloseIconClickListener {
            binding.chipGroup.removeView(it)
            Toast.makeText(this,"Chip 1",Toast.LENGTH_LONG).show()
        }
        binding.Chip3.setOnCloseIconClickListener {
            binding.chipGroup.removeView(it)
            Toast.makeText(this,"Chip 1",Toast.LENGTH_LONG).show()
        }
        binding.Chip4.setOnCloseIconClickListener {
            binding.chipGroup.removeView(it)
            Toast.makeText(this,"Chip 1",Toast.LENGTH_LONG).show()
        }
    }
}
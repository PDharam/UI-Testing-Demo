package com.pdharam.sampleuitestingapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.pdharam.sampleuitestingapp.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvResult.setText(intent.getStringExtra("KEY"))

    }
}
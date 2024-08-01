package com.pdharam.sampleuitestingapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.pdharam.sampleuitestingapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSubmit.setOnClickListener {
            val msg = "Title : ${binding.edtName.text} | Desc : ${binding.edtDesc.text}"

            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            intent.putExtra("KEY", msg)
            startActivity(intent)
        }
    }
}
package com.teknorial.learnviewbinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.teknorial.learnviewbinding.databinding.ActivityMainBinding

//deklarasi variable binding
private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //inisialisasi binding
        binding = ActivityMainBinding.inflate(layoutInflater)

        //memanggil layout dengan menggunakan binding.root
        setContentView(binding.root)

        var number = 0
        //membuat click listener pada button
        binding.btnPlusOne.setOnClickListener {
            number += 1
            //mengubah value textView
            binding.tvNumber.text = number.toString()
        }

    }
}
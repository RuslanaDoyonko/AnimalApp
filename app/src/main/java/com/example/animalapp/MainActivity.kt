package com.example.animalapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.animalapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = Intent(this, InfoActivity::class.java)

        binding.btnShowCatInfo.setOnClickListener {
            intent.putExtra("EXTRA_ANIMAL", "cat")
            startActivity(intent)
        }

        binding.btnShowDogInfo.setOnClickListener {
            intent.putExtra("EXTRA_ANIMAL", "dog")
            startActivity(intent)
        }

        binding.btnShowParrotInfo.setOnClickListener {
            intent.putExtra("EXTRA_ANIMAL", "parrot")
            startActivity(intent)
        }
    }
}
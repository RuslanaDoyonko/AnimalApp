package com.example.animalapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.animalapp.databinding.ActivityInfoBinding

class InfoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        when (intent.getStringExtra("EXTRA_ANIMAL")) {
            "cat" -> setData(Animal.cat)
            "dog" -> setData(Animal.dog)
            "parrot" -> setData(Animal.parrot)
            else -> {setData(Animal("Error!", "", "", R.drawable.ic_launcher_foreground))}
        }
    }

    private fun setData(animal: Animal) {
        binding.tvTitle.text = animal.name
        binding.tvSubtitle.text = animal.subtitle
        binding.tvDescription.text = animal.description
        binding.ivAnimal.setImageResource(animal.imageResource)
    }
}
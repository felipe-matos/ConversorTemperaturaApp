package com.conversortemperaturaapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.conversortemperaturaapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val  binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.buttonConverter.setOnClickListener {
            if(!binding.editCelsius.text.toString().isEmpty()){

                val clesius =  binding.editCelsius.text.toString().toDouble()
                val fahrenheit = String.format("%.2f",clesius * 1.8 + 32)

                binding.textResultado.text = "$fahrenheit ºF"

            } else {
                binding.textResultado.text = "Temperatura inválida"
            }

        }

    }
}
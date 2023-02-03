package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding // binder til ActivityMain

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view: View = binding.root
        setContentView(view)

        binding.buttonAddNumbers.setOnClickListener {

            var firstNumber = binding.numberOne.text.toString().toInt()
            var secondNumber = binding.numberTwo.text.toString().toInt()

            var result = firstNumber + secondNumber
            binding.mathResult.text = "$result"

        }



    }
}
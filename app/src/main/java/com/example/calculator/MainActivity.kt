package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding // binder til ActivityMain

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view: View = binding.root
        setContentView(view)

        val spinner : Spinner = binding.calculatorSpinner
        ArrayAdapter.createFromResource(
            this, R.array.calculatorOperators, android.R.layout.simple_spinner_dropdown_item
        ).also {adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adapter
        }

        binding.buttonCalculateNumbers.setOnClickListener {

            var firstNumber = binding.numberOne.text.toString().toDouble()
            var secondNumber = binding.numberTwo.text.toString().toDouble()
            val operation = binding.calculatorSpinner.selectedItem
            var result = 0.0

            when (operation){
                "+" -> result = (firstNumber + secondNumber)
                "-" -> result = (firstNumber - secondNumber)
                "/" -> result = (firstNumber / secondNumber)
                "*" -> result = (firstNumber * secondNumber)
            }

            binding.mathResult.text = "$result"

        }

    }
}
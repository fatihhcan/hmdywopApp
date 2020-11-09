package com.example.hmdywopapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.format.DateFormat.format
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.lang.String.format
import java.text.MessageFormat.format


class MainActivity : AppCompatActivity() {

    val KILO_TO_POUND = 2.2045
    val MARS = 0.38
    val POUND_TO_KILO = 0.45359237
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userWeight = findViewById<EditText>(R.id.editTextWeight).text

        val calculateButton = findViewById<Button>(R.id.buttonCalculate)

        calculateButton.setOnClickListener {
            var userWeightPound = kiloToPound(userWeight.toString().toDouble())
            var marsWeightPound = userWeightPound * MARS
            var marsWeightKilo = poundToKilo(marsWeightPound)

            var result = findViewById<TextView>(R.id.textViewResult).text
             result = marsWeightKilo.toString()
            findViewById<TextView>(R.id.textViewResult).text = result
        }


    }

    fun kiloToPound(kilo : Double) : Double {

        return kilo * KILO_TO_POUND
    }

    fun poundToKilo(pound : Double) : Double {

        return pound * POUND_TO_KILO
    }


}
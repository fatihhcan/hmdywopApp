package com.example.hmdywopapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText


class MainActivity : AppCompatActivity() {

    val KILO_TO_POUND = 2.2045

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userWeight = findViewById<EditText>(R.id.editTextWeight).text


    }

    fun kiloToPound(kilo : Double) : Double {

        return kilo * KILO_TO_POUND 
    }
}
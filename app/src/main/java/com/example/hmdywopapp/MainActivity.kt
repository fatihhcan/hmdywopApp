package com.example.hmdywopapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text


class MainActivity : AppCompatActivity(), View.OnClickListener {

    val KILO_TO_POUND = 2.2045
    val MARS = 0.38
    val VENUS = 0.91
    val JUPITER = 2.34
    val POUND_TO_KILO = 0.45359237


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val chechBoxVenus = findViewById<CheckBox>(R.id.checkBoxVenus)
        val chechBoxMars = findViewById<CheckBox>(R.id.checkBoxMars)
        val chechBoxJupiter = findViewById<CheckBox>(R.id.checkBoxJupiter)

        chechBoxVenus.setOnClickListener(this)
        chechBoxMars.setOnClickListener(this)
        chechBoxJupiter.setOnClickListener(this)

     //  val userWeightv = findViewById<EditText>(R.id.editTextWeight).text.toString()

        val calculateButton = findViewById<Button>(R.id.buttonCalculate)

       /* calculateButton.setOnClickListener {
            var userWeightPound = kiloToPound(userWeight.toString().toDouble())
            var marsWeightPound = userWeightPound * MARS
            var marsWeightKilo = poundToKilo(marsWeightPound)

            var result = findViewById<TextView>(R.id.textViewResult).text
             result = marsWeightKilo.toString()
            findViewById<TextView>(R.id.textViewResult).text = result
        }*/


    }

    fun kiloToPound(kilo : Double) : Double {

        return kilo * KILO_TO_POUND
    }

    fun poundToKilo(pound : Double) : Double {

        return pound * POUND_TO_KILO
    }

    override fun onClick(v: View?) {

        v as CheckBox
        var isChecked:Boolean = v.isChecked
        var userWeight = findViewById<EditText>(R.id.editTextWeight).text.toString().toDouble()
        var userPound = kiloToPound(userWeight)


        if (!TextUtils.isEmpty(userWeight.toString())){

        }

        when(v.id){
            R.id.checkBoxMars -> if(isChecked && !TextUtils.isEmpty(userWeight.toString())){
                calculateWeightPound(userPound, v)
            }
            R.id.checkBoxVenus -> if(isChecked && !TextUtils.isEmpty(userWeight.toString())){
                calculateWeightPound(userPound, v)
            }
            R.id.checkBoxJupiter -> if(isChecked && !TextUtils.isEmpty(userWeight.toString())){
                calculateWeightPound(userPound, v)
            }

        }
    }
    
    fun calculateWeightPound(pound: Double, checkBox: CheckBox){
        var result : Double = 0.0
        when(checkBox.id){
            R.id.checkBoxMars -> result = pound * MARS
            R.id.checkBoxJupiter -> result = pound * JUPITER
            R.id.checkBoxVenus -> result = pound * VENUS
            else -> result = 0.0
        }
       var resultView = findViewById<TextView>(R.id.textViewResult).text

        var resultToKilo = poundToKilo(result)
        resultView = resultToKilo.toString()
        findViewById<TextView>(R.id.textViewResult).text = resultView


    }


}
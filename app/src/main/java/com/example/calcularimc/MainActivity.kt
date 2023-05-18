package com.example.calcularimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.widget.EditText
import android.widget.Toast
import kotlin.math.truncate

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calcular (view: View) {

    var IMC :Float
    var peso = findViewById<EditText>(R.id.activity_main_txtpeso)
    var estatura =findViewById<EditText>(R.id.activity_main_txtestatura)

    peso.error=null
    estatura.error=null


        IMC =  peso.text.toString().toFloat()/(estatura.text.toString().toFloat()*estatura.text.toString().toFloat());

        var IMCMessage = ""
        IMC= truncate(IMC)
        if(IMC <= 15) IMCMessage = "Delgadez muy severa"
        else if(IMC > 15 && IMC <= 15.9) IMCMessage = "Delgadez severa"
        else if(IMC > 16 && IMC <= 18.4) IMCMessage = "Delgadez"
        else if(IMC > 18.5 && IMC <= 24.9) IMCMessage = "Peso saludable"
        else if(IMC >= 25 && IMC <= 29.9) IMCMessage = "Sobrepeso"
        else if(IMC > 30 && IMC <= 34.9) IMCMessage = "Obesidad moderada"
        else if(IMC > 35 && IMC <= 39.9) IMCMessage  = "Obesidad severa"
        else if(IMC > 40) IMCMessage = "Obesidad mórbida"

        Toast.makeText(
            this@MainActivity,
            IMC.toString() + ": " + IMCMessage,
            Toast.LENGTH_LONG
        ).show()
    if(peso.text.toString().trim().isEmpty()){
        if (estatura.text.toString().trim().isEmpty()){


        }

      }

    }

}
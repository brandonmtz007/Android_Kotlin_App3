package com.example.calculadoraradio5f2023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val et1=findViewById<EditText>(R.id.et1)
        val et2=findViewById<EditText>(R.id.et2)
        val r1=findViewById<RadioButton>(R.id.r1)
        val r2=findViewById<RadioButton>(R.id.r2)
        val tv1=findViewById<TextView>(R.id.tv1)
        val button=findViewById<Button>(R.id.button)
        button.setOnClickListener {
            try {
                if (r1.isChecked)
                    tv1.text = "Resultado: ${et1.text.toString().toFloat() + et2.text.toString().toFloat()}"
                if (r2.isChecked)
                    tv1.text = "Resultado: ${et1.text.toString().toFloat() - et2.text.toString().toFloat()}"
            }catch (e:Exception){
                tv1.text = "Error al capturar los datos"
            }
            }
    }
}
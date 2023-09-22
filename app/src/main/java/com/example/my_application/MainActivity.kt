package com.example.my_application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSaludar = findViewById<Button>(R.id.btnSaludar)
        val edtxtN1 = findViewById<EditText>(R.id.edtxtN1)
        val edtxtN2 = findViewById<EditText>(R.id.edtxtN2)
        val txtSumaResultado = findViewById<TextView>(R.id.txtSumaResultado)

        btnSaludar.setOnClickListener{
            var N1 = edtxtN1.text.toString().toDouble()
            var N2 = edtxtN2.text.toString().toDouble()
            txtSumaResultado.setText(suma(N1,N2).toString())
        }



    }

    private fun suma(N1:Double, N2:Double): Double{

        return N1 + N2

    }
}
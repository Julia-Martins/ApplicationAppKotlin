package com.example.applicationappkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClick : Button = findViewById(R.id.btnClick)

        btnClick.setOnClickListener {
            TitleChange()
        //    Toda vez que eu apertar o Botão irá aparecer a mensagem
        //    que foi programada por um curto periodo
        //    Toast.makeText( this, "Welcome to Wolf Forces", Toast.LENGTH_SHORT).show()
        }
    }

    private fun TitleChange(){
        val txtResult : TextView = findViewById(R.id.txtCounting)

        val randomInt = java.util.Random().nextInt(21) + 1

        txtResult.text = randomInt.toString()
    }
}
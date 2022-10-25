package com.example.applicationappkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

//    lateinit var DiceImage : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClick : Button = findViewById(R.id.btnClick)
        btnClick.setOnClickListener {
            NumberChange()
//            KingDice()
        //    Toda vez que eu apertar o Botão irá aparecer a mensagem
        //    que foi programada por um curto periodo
            Toast.makeText( this, "Every time you click in the button the number will change", Toast.LENGTH_SHORT).show()
        }
//        DiceImage = findViewById(R.id.imgDice1)
    }

    private fun NumberChange(){
        val txtResult : TextView = findViewById(R.id.txtCounting)

        val randomInt = java.util.Random().nextInt(100) + 1

        txtResult.text = randomInt.toString()
    }

    /*private fun KingDice(){
        //val txtResult : TextView = findViewById(R.id.txtCounting)

        val randomInt = java.util.Random().nextInt(6) + 1
        val drawableResource = when(randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        DiceImage.setImageResource(drawableResource)

        //txtResult.text = randomInt.toString()
    }*/
}
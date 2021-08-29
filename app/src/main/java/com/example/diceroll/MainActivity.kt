package com.example.diceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button_roll)

        rollButton.setOnClickListener {
            rollDice()
        }
    }


private fun rollDice() {
    //Create new dice object from class Dice with 6 sides
    val dice1 = Dice(6)
    val dice2 = Dice(6)
    val diceRoll1 = dice1.roll()
    val diceRoll2 = dice2.roll()
    val image: ImageView = findViewById(R.id.diceImage1)
    val image2: ImageView = findViewById(R.id.diceImage2)


    val drawableResource = when (diceRoll1) {

        1 -> R.drawable.dice_1
        2 -> R.drawable.dice_2
        3 -> R.drawable.dice_3
        4 -> R.drawable.dice_4
        5 -> R.drawable.dice_5
        else -> R.drawable.dice_6
    }
    val drawableResource2 = when (diceRoll2) {

        1 -> R.drawable.dice_1
        2 -> R.drawable.dice_2
        3 -> R.drawable.dice_3
        4 -> R.drawable.dice_4
        5 -> R.drawable.dice_5
        else -> R.drawable.dice_6
    }

    image.setImageResource(drawableResource)
    image2.setImageResource(drawableResource2)
}


class Dice(private val sides: Int) {

    fun roll(): Int {
         return (1..sides).random()
     }
}


}
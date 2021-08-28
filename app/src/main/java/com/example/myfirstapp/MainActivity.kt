package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image : ImageView = findViewById(R.id.imageView)
        val gift : Button = findViewById(R.id.button)
        val changed : ConstraintLayout = findViewById(R.id.parentlayout)

        image.visibility = View.INVISIBLE

        gift.setOnClickListener {
            image.visibility = View.VISIBLE
            changed.setBackgroundResource(R.color.black)

        }
    }
}
package com.example.prueba


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sunset: ImageView = this.findViewById(R.id.sunset)
        sunset.setImageResource(R.drawable.sunset)

    }
}
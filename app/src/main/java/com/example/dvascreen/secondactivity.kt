package com.example.dvascreen

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.aktiviti_second)

        val buttonBack: Button = findViewById(R.id.buttonBack)
        buttonBack.setOnClickListener {
            finish()
        }
    }
}
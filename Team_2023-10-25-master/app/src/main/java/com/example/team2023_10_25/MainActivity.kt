package com.example.team2023_10_25

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Это комментарий
        Toast.makeText(this, "Привет!", Toast.LENGTH_SHORT).show();

    }
}
package com.example.laboratorio4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.buttonIniciar);

        initListeners()
    }

    fun initListeners(){
        button.setOnClickListener{
            Toast.makeText(this, "Sebastián José Solorzano Pérez", Toast.LENGTH_LONG).show()
        }
    }
}
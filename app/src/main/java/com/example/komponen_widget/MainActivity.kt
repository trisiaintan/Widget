package com.example.komponen_widget

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn_register = findViewById<Button>(R.id.btn_register)
        btn_register.setOnClickListener {
            Toast.makeText(this@MainActivity, "Berhasil", Toast.LENGTH_LONG).show()

        }



        }

    }

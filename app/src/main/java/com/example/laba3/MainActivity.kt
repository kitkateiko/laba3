package com.example.laba3

import android.os.Bundle
import android.text.TextUtils.replace
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Toast
import android.view.View
import android.widget.EditText


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    fun formula(view: View)
    {


        if (findViewById<EditText>(R.id.editTextText).text.toString().equals(""))
        {
            return
        }
        val x = findViewById<EditText>(R.id.editTextText).text.toString().toCharArray()
        val i = findViewById<EditText>(R.id.editTextNumberSigned).text.toString().toInt()
        val c = findViewById<EditText>(R.id.editTextText2).text.toString().toCharArray()
        for(n in 0..i-1)
        {
            x[n] = c[0]
        }
        Toast.makeText(this, String(x), Toast.LENGTH_SHORT).show()
    }
}
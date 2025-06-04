package com.example.apklayarnusantara

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val signInText = findViewById<TextView>(R.id.txtSignin)
        signInText.setOnClickListener {
            finish()
        }
    }
}
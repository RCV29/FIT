package com.example.nagngangawngaw


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val username: EditText = findViewById(R.id.et_username)
        val gender: EditText = findViewById(R.id.et_gender)
        val create: Button = findViewById(R.id.bt_create)

        create.setOnClickListener() {
            val inputs = gender.text.toString().toLowerCase()

            if (inputs == "male") {
                val intent = Intent(this, Malebody::class.java)
                startActivity(intent)
            } else if (inputs == "female") {
                val intent = Intent(this, FemaleBody::class.java)
                startActivity(intent)
            }
        }
    }
}





package com.example.nagngangawngaw
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Malebody : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_male)

        val slim: ImageView = findViewById(R.id.s_male)
        val lean: ImageView = findViewById(R.id.l_male)
        val bulk: ImageView = findViewById(R.id.b_male)

        slim.setOnClickListener {
            val intent = Intent(this, Smale::class.java)
            startActivity(intent)
        }

        lean.setOnClickListener {
            val intent = Intent(this, Lmale::class.java)
            startActivity(intent)
        }

        bulk.setOnClickListener {
            val intent = Intent(this, Bmale::class.java)
            startActivity(intent)
        }
    }
}
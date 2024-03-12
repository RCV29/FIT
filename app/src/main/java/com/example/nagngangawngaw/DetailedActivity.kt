package com.example.nagngangawngaw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.nagngangawngaw.databinding.ActivityDetailedBinding
import kotlinx.android.synthetic.main.toolbar.view.left_icon
import kotlinx.android.synthetic.main.toolbar.view.right_icon

class DetailedActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailedBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_detailed)
        val imgfirst = findViewById<ImageView>(R.id.detailedActivityIv)
        val text = findViewById<TextView>(R.id.detailedActivityTv)
        val description = findViewById<TextView>(R.id.description)
        val imgsecond = findViewById<ImageView>(R.id.detailedActivityIv2)

        val intent = intent

        val image = intent?.getIntExtra("image", 0)
        val title = intent?.getStringExtra("title")
        val descriptions = intent?.getStringExtra("description")
        val image2 = intent?.getIntExtra("image2", 0)

        if (image != null) {
            imgfirst.setImageResource(image)
        }

        description.text = descriptions

        if (image2 != null) {
            imgsecond.setImageResource(image2)
        }

        text.text = title

        initUI()

    }

    private fun initUI() {
        binding.toolBox.left_icon.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.toolBox.right_icon.setOnClickListener {
            val intent = Intent(this, Shoppe::class.java)
            startActivity(intent)
        }

    }
}
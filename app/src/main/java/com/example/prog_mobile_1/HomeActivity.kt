package com.example.prog_mobile_1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    private lateinit var imgHomeLogo: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_screen)

        imgHomeLogo = findViewById(R.id.img_home_logo);
        imgHomeLogo.setOnClickListener {
            //var intent = Intent(this, MainActivity::class.java)
            //startActivity(intent)
            finish();
        }
    }
}
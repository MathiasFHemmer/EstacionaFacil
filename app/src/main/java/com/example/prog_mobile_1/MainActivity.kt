package com.example.prog_mobile_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.prog_mobile_1.HomeActivity

class MainActivity : AppCompatActivity() {
    private lateinit var btn_enter: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_enter = findViewById(R.id.btn_enter);
        btn_enter.setOnClickListener {
            var intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}
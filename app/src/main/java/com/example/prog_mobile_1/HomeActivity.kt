package com.example.prog_mobile_1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity : AppCompatActivity() {
    private lateinit var imgHomeLogo: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_screen)

        var homeItens = arrayListOf(
            HomeItem("Materia 1", "Bloco A\nSala 201", R.drawable.icon_materia),
            HomeItem("Materia 2", "Bloco C\nSala 107", R.drawable.icon_materia),
            HomeItem("Materia 3", "Bloco D\nSala 404", R.drawable.icon_materia),
            HomeItem("Mapa Univali", "Mapa de calor\nBlocos e salas\nConcentração de vagas", R.drawable.icon_map),
        )
        var itensView : RecyclerView = findViewById(R.id.recView);
        itensView.layoutManager = LinearLayoutManager(this);
        itensView.adapter = HomeRVItemAdapter(applicationContext, homeItens)

        imgHomeLogo = findViewById(R.id.img_home_logo);
        imgHomeLogo.setOnClickListener {
            finish();
        }
    }
}
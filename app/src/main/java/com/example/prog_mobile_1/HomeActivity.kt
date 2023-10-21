package com.example.prog_mobile_1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.prog_mobile_1.simples_list.SimpleListItemAdapter
import com.example.prog_mobile_1.simples_list.SimplesListItem

class HomeActivity : AppCompatActivity() {
    private lateinit var imgHomeLogo: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)

        var homeItens = arrayListOf(
            SimplesListItem("Materia 1", "Bloco A\nSala 201", R.drawable.icon_materia, ::onClassromMapButtonClick),
            SimplesListItem("Materia 2", "Bloco C\nSala 107", R.drawable.icon_materia, ::onClassromMapButtonClick),
            SimplesListItem("Materia 3", "Bloco D\nSala 404", R.drawable.icon_materia, ::onClassromMapButtonClick),
            SimplesListItem("Materia 4", "Bloco A\nSala 202", R.drawable.icon_materia, ::onClassromMapButtonClick),
            SimplesListItem("Mapa Univali", "Mapa de calor\nBlocos e salas\nConcentração de vagas", R.drawable.icon_map, ::onHeatMapButtonClick),
            SimplesListItem("Configurações", "Acessibilidade\nPreferencias\nOutros", R.drawable.icon_config, ::onConfigButtonClick),
        )
        var itensView : RecyclerView = findViewById(R.id.recView)
        itensView.layoutManager = LinearLayoutManager(this)
        itensView.adapter = SimpleListItemAdapter(applicationContext, homeItens)

        imgHomeLogo = findViewById(R.id.img_home_logo);
        imgHomeLogo.setOnClickListener {
            finish();
        }
    }
    fun onHeatMapButtonClick() : Unit {
        var intent = Intent(this, HeatMapActicity::class.java)
        intent.putExtra("isClassroom", false);
        startActivity(intent)
    }

    fun onClassromMapButtonClick() : Unit {
        var intent = Intent(this, HeatMapActicity::class.java)
        intent.putExtra("isClassroom", true);
        startActivity(intent)
    }

    fun onConfigButtonClick() : Unit {
        var intent = Intent(this, ConfigActivity::class.java)
        startActivity(intent)
    }
}
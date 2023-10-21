package com.example.prog_mobile_1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.prog_mobile_1.simples_list.SimpleListItemAdapter
import com.example.prog_mobile_1.simples_list.SimplesListItem
import kotlin.system.exitProcess

class ConfigActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_config)

        var configItens = arrayListOf(
            SimplesListItem("Preferencias", "", R.drawable.icon_preferences, {}),
            SimplesListItem("Acessibilidade", "Bloco C\nSala 107", R.drawable.icon_accessibility, {}),
            SimplesListItem("Sobre", "Bloco D\nSala 404", R.drawable.icon_about, {}),
            SimplesListItem("Sair", "Bloco A\nSala 202", R.drawable.icon_exit){
                ActivityCompat.finishAffinity(this)
            },
        )

        findViewById<TextView>(R.id.txt_back).setOnClickListener{
            finish()
        }


        var itensView : RecyclerView = findViewById(R.id.recView)
        itensView.layoutManager = LinearLayoutManager(this)
        itensView.adapter = SimpleListItemAdapter(applicationContext, configItens)
    }
}
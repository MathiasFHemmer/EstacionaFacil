package com.example.prog_mobile_1

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HeatMapActicity : AppCompatActivity() {
    private lateinit var btn_back: Button
    private lateinit var btn_toggleHeatMap: Button
    private lateinit var img_heatMap: ImageView
    private var isHeatMap: Boolean = false
    var isClassroom: Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_heat_map)

        img_heatMap = findViewById(R.id.img_heatMap)
        btn_toggleHeatMap = findViewById(R.id.btn_toggleHeatMap)

        btn_toggleHeatMap.setOnClickListener{
            onToggleHeatmapView()
        }

        isClassroom = intent.getBooleanExtra("isClassroom", false)

        if(isClassroom){
            img_heatMap.setImageResource(R.drawable.heatmap_pinpoint_off)
        }

        findViewById<TextView>(R.id.txt_backArrow).setOnClickListener{
            finish()
        }
    }

    fun onToggleHeatmapView(): Unit{
        if(isHeatMap){
            if(isClassroom){
                img_heatMap.setImageResource(R.drawable.heatmap_pinpoint_off)
            }else{
                img_heatMap.setImageResource(R.drawable.heatmap_off)
            }
            isHeatMap = false
        }else{
            if(isClassroom){
                img_heatMap.setImageResource(R.drawable.heatmap_pinpoint_on)
            }else{
                img_heatMap.setImageResource(R.drawable.heatmap_on)
            }
            isHeatMap = true
        }
    }
}
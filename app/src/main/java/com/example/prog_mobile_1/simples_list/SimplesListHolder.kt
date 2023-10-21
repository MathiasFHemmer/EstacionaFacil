package com.example.prog_mobile_1.simples_list

import android.view.View
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.prog_mobile_1.R

class SimplesListHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var txt_Title: TextView = itemView.findViewById(R.id.home_item_title)
    var txt_Body: TextView = itemView.findViewById(R.id.home_item_body)
    var img_Logo: ImageView = itemView.findViewById(R.id.home_item_image)
    var rl_root : RelativeLayout = itemView.findViewById(R.id.rl_root)
}
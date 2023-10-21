package com.example.prog_mobile_1

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
class HomeRVItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var txt_Title: TextView = itemView.findViewById(R.id.home_item_title);
    var txt_Body: TextView = itemView.findViewById(R.id.home_item_body);
    var img_Logo: ImageView = itemView.findViewById(R.id.home_item_image);
}
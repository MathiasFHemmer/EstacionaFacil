package com.example.prog_mobile_1

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class HomeRVItemAdapter(context: Context, homeItens: List<HomeItem>) : RecyclerView.Adapter<HomeRVItemHolder>() {
    var Context = context;
    var HomeItens = homeItens
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeRVItemHolder {
        return HomeRVItemHolder(LayoutInflater.from(Context).inflate(R.layout.home_screen_item, parent, false))
    }

    override fun getItemCount(): Int {
        return HomeItens.size;
    }

    override fun onBindViewHolder(holder: HomeRVItemHolder, position: Int) {
        holder.txt_Title.setText(HomeItens.get(position).Title)
        holder.txt_Body.setText(HomeItens.get(position).Body);
        holder.img_Logo.setImageResource(HomeItens.get(position).SpriteResId);
    }
}
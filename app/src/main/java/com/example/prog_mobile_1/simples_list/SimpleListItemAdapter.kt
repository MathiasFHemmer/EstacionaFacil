package com.example.prog_mobile_1.simples_list

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.prog_mobile_1.R

class SimpleListItemAdapter(context: Context, homeItens: List<SimplesListItem>) : RecyclerView.Adapter<SimplesListHolder>() {
    var Context = context;
    var HomeItens = homeItens
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SimplesListHolder {
        return SimplesListHolder(LayoutInflater.from(Context).inflate(R.layout.listitem_simple_item, parent, false))
    }

    override fun getItemCount(): Int {
        return HomeItens.size;
    }

    override fun onBindViewHolder(holder: SimplesListHolder, position: Int) {
        holder.txt_Title.text = HomeItens[position].Title
        holder.txt_Body.text = HomeItens[position].Body;
        holder.img_Logo.setImageResource(HomeItens[position].SpriteResId);

        holder.rl_root.setOnClickListener {
            HomeItens[position].Callback()
        }
    }
}
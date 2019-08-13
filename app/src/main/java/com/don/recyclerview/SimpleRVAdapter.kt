package com.don.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import android.support.v7.widget.RecyclerView


internal class SimpleRVAdapter : RecyclerView.Adapter<SimpleViewHolder>() {

    var data = arrayOf("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SimpleViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_recyclerview_row, parent, false)
        return SimpleViewHolder(view)
    }

    override fun onBindViewHolder(holder: SimpleViewHolder, position: Int) {
        holder.bindData(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }
}

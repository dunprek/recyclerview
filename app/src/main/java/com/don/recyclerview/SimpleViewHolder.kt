package com.don.recyclerview

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView


internal class SimpleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    var textView: TextView = itemView.findViewById(R.id.textView)

    fun bindData(data: String) {
        textView.text = data
    }
}
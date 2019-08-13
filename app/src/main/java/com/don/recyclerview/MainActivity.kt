package com.don.recyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gridLayoutManager = GridLayoutManager(this, 3)
        val spanSizeLookup = object : GridLayoutManager.SpanSizeLookup() {
            override fun getSpanSize(position: Int): Int {
                return if (position % 4 == 0) {
                    3
                } else {
                    1
                }
            }
        }
        gridLayoutManager.spanSizeLookup = spanSizeLookup
        recycler_view.layoutManager = gridLayoutManager
        recycler_view.adapter = SimpleRVAdapter()
    }
}

package com.example.tablayoutapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.tablayoutapp.Adapter.ViewAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    val tabsArray = arrayOf("Books", "Games", "Movies")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewpager = findViewById<ViewPager2>(R.id.viewpager)
        val tablayout = findViewById<TabLayout>(R.id.tablayout)

        val adapter = ViewAdapter(
            supportFragmentManager, lifecycle
        )

        viewpager.adapter = adapter
        TabLayoutMediator(tablayout, viewpager){
            tab, position -> tab.text = tabsArray[position]
        }.attach()
    }
}
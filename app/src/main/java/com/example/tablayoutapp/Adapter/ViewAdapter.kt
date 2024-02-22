package com.example.tablayoutapp.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.tablayoutapp.Fragments.BooksFragment
import com.example.tablayoutapp.Fragments.GamesFragment
import com.example.tablayoutapp.Fragments.MovieFragment

class ViewAdapter (fragmentManager: FragmentManager, lifecycle: Lifecycle): FragmentStateAdapter(fragmentManager,lifecycle) {


    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        when(position){
            0 ->return BooksFragment()
            1-> return GamesFragment()
            2-> return MovieFragment()
        }
        return MovieFragment()
    }

}
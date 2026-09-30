package com.example.pertemuan6

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.pertemuan6.HomeFragment
import com.example.pertemuan6.MateriFragment
import com.example.pertemuan6.QuizFragment


class SectionsPagerAdapter(activity: AppCompatActivity) :
    FragmentStateAdapter(activity) {

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> HomeFragment()
            1 -> MateriFragment()
            2 -> QuizFragment()
            else -> HomeFragment()
        }
    }

    override fun getItemCount(): Int {
        return 3
    }
}
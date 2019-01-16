package com.group.nugraha.viewpager0116

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.group.nugraha.viewpager0116.last.LastmatchFragment

class MyPagerAdapter (fm: FragmentManager): FragmentPagerAdapter(fm){
    override fun getItem(p0: Int): Fragment {
        return pages[p0]
    }

    override fun getCount(): Int = pages.size


    private val pages = listOf(
        LastmatchFragment(),
        SecondFragment(),
        ThirdFragment()
    )

    override fun getPageTitle(p0: Int): CharSequence? {
        return when(p0){
            0 -> "Last match"
            1 -> "Next round"
            else -> "Reserve"
        }
    }
}
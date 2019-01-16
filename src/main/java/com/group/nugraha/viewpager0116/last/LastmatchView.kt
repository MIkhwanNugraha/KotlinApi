package com.group.nugraha.viewpager0116.last

import com.group.nugraha.viewpager0116.model.Event

interface LastmatchView {
    fun showLoading()
    fun hideLoading()
    fun showLastmatchList(data: List<Event>)
}
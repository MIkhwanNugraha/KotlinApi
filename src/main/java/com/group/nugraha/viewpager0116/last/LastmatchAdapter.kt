package com.group.nugraha.viewpager0116.last

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.group.nugraha.viewpager0116.model.Event

class LastmatchAdapter (private val events: List<Event>)
    : RecyclerView.Adapter<LastmatchViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): LastmatchViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(p0: LastmatchViewHolder, p1: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

class LastmatchViewHolder(view: View) :RecyclerView.ViewHolder(view){
    fun bindItem(events: Event){

    }
}
package com.group.nugraha.viewpager0116.last

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.group.nugraha.viewpager0116.model.Event
import com.group.nugraha.viewpager0116.R
import org.jetbrains.anko.find

class LastmatchAdapter (val context: Context, private val events: List<Event>, private val listener: (Event) -> Unit)
    : RecyclerView.Adapter<LastmatchViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): LastmatchViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_item, p0, false)
        return LastmatchViewHolder(view)
    }

    override fun getItemCount(): Int = events.size

    override fun onBindViewHolder(holder: LastmatchViewHolder, p1: Int) {
        holder.bindItem(events[p1], listener)
    }
}

class LastmatchViewHolder(itemview: View) :RecyclerView.ViewHolder(itemview){
    private val homename: TextView = itemview.find(R.id.tv_home_name)
    fun bindItem(events: Event, listener: (Event) -> Unit){
        homename.text = events.strHomeTeam
        itemView.setOnClickListener { listener(events) }
    }
}
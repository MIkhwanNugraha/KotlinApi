package com.group.nugraha.viewpager0116.last


import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.widget.SwipeRefreshLayout
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import android.widget.Spinner
import com.group.nugraha.viewpager0116.R
import com.group.nugraha.viewpager0116.model.Event
import kotlinx.android.synthetic.main.fragment_lastmatch.*


class LastmatchFragment : Fragment(), LastmatchView {
    private var events: MutableList<Event> = mutableListOf()
    private lateinit var presenter: LastmatchPresenter
    private lateinit var adapter: LastmatchAdapter
    private lateinit var spinner: Spinner
    private lateinit var listTeam: RecyclerView
    private lateinit var progressBar: ProgressBar
    private lateinit var swipeRefresh: SwipeRefreshLayout
    //private lateinit var leagueName: String

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_lastmatch, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        rvlastmatch = findViewById(R.id.recyclerview_lastmatch)
        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this, 1)
        recyclerView
        adapter = LastmatchAdapter(this, events){
            context?.startActivity<DetailActivity>()
        }

    }
}

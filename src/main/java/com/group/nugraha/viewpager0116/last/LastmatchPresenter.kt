package com.group.nugraha.viewpager0116.last

import com.google.gson.Gson
import com.group.nugraha.viewpager0116.api.ApiRepository
import com.group.nugraha.viewpager0116.api.TheSportDBApi
import com.group.nugraha.viewpager0116.model.EventsResponse
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

class LastmatchPresenter(private val view: LastmatchView,
                         private val apiRepository: ApiRepository,
                         private val gson: Gson) {

    fun getLastmatchList(eventLastId: String?){
        view.showLoading()
        doAsync {
            val data = gson.fromJson(apiRepository
                .doRequest(TheSportDBApi.getEventLast(eventLastId)),
                EventsResponse::class.java)

            uiThread {
                view.hideLoading()
                view.showLastmatchList(data.events)
            }
        }
    }
}
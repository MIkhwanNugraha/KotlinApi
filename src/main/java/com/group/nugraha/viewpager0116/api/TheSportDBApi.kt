package com.group.nugraha.viewpager0116.api

import com.group.nugraha.viewpager0116.BuildConfig

object TheSportDBApi {

    fun getEventLast(eventLastId: String?): String{
        return BuildConfig.BASE_URL + "api/v1/json/${BuildConfig.TSDB_API_KEY}" + "/eventpastleague.php?id=" + eventLastId
    }

    fun getEventNext(eventNextId: String?): String{
        return BuildConfig.BASE_URL + "api/v1/json/${BuildConfig.TSDB_API_KEY}" + "/eventnextleague.php?id=" + eventNextId
    }

    fun getTeamDetail(teamId: String?): String{
        return BuildConfig.BASE_URL + "api/v1/json/${BuildConfig.TSDB_API_KEY}" + "/lookupteam.php?id=" + teamId
    }

    fun getLookUpEvent(lookUpEventId: String?): String{
        return BuildConfig.BASE_URL + "api/v1/json/${BuildConfig.TSDB_API_KEY}" + "/lookupevent.php?id=" + lookUpEventId
    }
}
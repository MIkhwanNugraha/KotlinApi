package com.group.nugraha.viewpager0116.model

import com.google.gson.annotations.SerializedName

class Event (
    @SerializedName("strHomeTeam")
    val strHomeTeam: String?=null,

    @SerializedName("intHomeScore")
    val intHomeScore: String?=null,

    @SerializedName("dateEvent")
    val dateEvent: String?=null,

    @SerializedName("strAwayTeam")
    val strAwayTeam: String?=null,

    @SerializedName("intAwayScore")
    val intAwayScore: String?=null

)

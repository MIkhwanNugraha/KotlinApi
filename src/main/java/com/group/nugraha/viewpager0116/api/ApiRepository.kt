package com.group.nugraha.viewpager0116.api

import java.net.URL

class ApiRepository {
    fun doRequest(url: String): String = URL(url).readText()
}
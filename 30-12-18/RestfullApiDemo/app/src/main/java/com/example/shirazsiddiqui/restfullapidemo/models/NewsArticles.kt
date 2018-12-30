package com.example.shirazsiddiqui.restfullapidemo.models

class NewsArticles {

    var status:String=""
    var totalResults:Int=0
    var articles:ArrayList<Articles>?=null
    override fun toString(): String {
        return "NewsArticles(status='$status', totalResults=$totalResults, articles=$articles)"
    }

}
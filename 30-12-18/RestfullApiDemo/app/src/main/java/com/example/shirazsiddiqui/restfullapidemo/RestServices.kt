package com.example.shirazsiddiqui.restfullapidemo

import com.example.shirazsiddiqui.restfullapidemo.models.NewsArticles
import retrofit2.Call
import retrofit2.http.GET

interface RestServices {

    @GET("top-headlines?country=in&category=business&apiKey=c4aaef8302824f779e1a58784dfac6fc")
    fun getNewsArticlebyCountry(): Call<NewsArticles>
    @GET("top-headlines?category=business&apiKey=c4aaef8302824f779e1a58784dfac6fc")
    fun getNewsArticlebyBusiness(): Call<NewsArticles>
    @GET("top-headlines?apiKey=c4aaef8302824f779e1a58784dfac6fc")
    fun getNewsArticle(): Call<NewsArticles>
}
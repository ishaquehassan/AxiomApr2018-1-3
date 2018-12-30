package com.example.shirazsiddiqui.restfullapidemo

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RestApi {
    companion object {
        private var retrofit: Retrofit? = null;
        fun getClient(): Retrofit? {

            if (retrofit == null) {
                retrofit = Retrofit.Builder()
                    .baseUrl("https://newsapi.org/v2/")
                    .addConverterFactory(GsonConverterFactory.create()).build()
            }

            return retrofit
        }
    }
}
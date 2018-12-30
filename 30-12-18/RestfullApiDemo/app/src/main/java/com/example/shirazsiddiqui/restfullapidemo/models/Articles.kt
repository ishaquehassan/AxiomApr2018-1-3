package com.example.shirazsiddiqui.restfullapidemo.models

class Articles {

    private val source: Source? = null
    private val author: String? = ""
    private val title: String? = ""
    private val description: String? = ""
    private val url: String? = ""
    private val urlToImage: String? = ""
    private val publishedAt: String? = ""
    private val content: String? = ""
    override fun toString(): String {
        return "Articles(source=$source, author=$author, title=$title, description=$description, url=$url, urlToImage=$urlToImage, publishedAt=$publishedAt, content=$content)"
    }

}
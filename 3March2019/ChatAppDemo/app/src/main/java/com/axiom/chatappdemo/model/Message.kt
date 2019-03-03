package com.axiom.chatappdemo.model

data class MessageChat(
    var chatId: String="",//converstation id
    var msg: String="",
    var timestamp: Long?=null,
    var msgId: String="",// particular msg id
    var senderId: String=""
) {
}
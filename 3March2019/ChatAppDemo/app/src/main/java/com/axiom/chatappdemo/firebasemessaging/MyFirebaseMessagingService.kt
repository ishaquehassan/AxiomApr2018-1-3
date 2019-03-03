package com.axiom.chatappdemo.firebasemessaging

import android.app.NotificationManager
import android.content.Context
import android.util.Log
import androidx.core.app.NotificationCompat
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage


class MyFirebaseMessagingService : FirebaseMessagingService() {

    override fun onMessageReceived(messageRemote: RemoteMessage?) {
        super.onMessageReceived(messageRemote)
        showNotification(messageRemote)
    }

    private fun showNotification(messageRemote: RemoteMessage?) {
        if (messageRemote != null && messageRemote.data != null)
            Log.d("Tag", messageRemote.data?.toString())

        var channelId = "channel-1"
        val Notification = NotificationCompat.Builder(this, channelId)
            .setContentTitle("My chat App")
            .setContentText("New Message")
            .setSmallIcon(com.axiom.chatappdemo.R.mipmap.ic_launcher)
            .build()


        val notificationManager = this.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        notificationManager.notify(System.currentTimeMillis().toInt(), Notification)

    }

    override fun onNewToken(p0: String?) {
        super.onNewToken(p0)
        sendToServer(p0)
    }

    private fun sendToServer(p0: String?) {

    }
}
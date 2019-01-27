package com.axiom.labtask

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase

/**
 * Created by lenovo on 20/01/2019.
 */
@Database(entities = arrayOf(Post::class), version = 1)
abstract class MyDatabase : RoomDatabase() {
    abstract fun getDao(): MyDao
}
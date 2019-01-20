package com.axiom.roomdb

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase

/**
 * Created by lenovo on 20/01/2019.
 */

@Database(entities = arrayOf(Movies::class), version = 1)
abstract class MyDatabase : RoomDatabase() {
    abstract fun getMyDao(): MoviesDao

}
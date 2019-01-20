package com.axiom.roomdb

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query

/**
 * Created by lenovo on 20/01/2019.
 */
@Dao
interface MoviesDao {
    @Insert
    fun insert(movies: Movies)

    @Delete
    fun delete(movies: Movies)

    //write name of the entity class after writing FROM
    @Query("SELECT *  FROM Movies")
    fun getAll(): List<Movies>

}
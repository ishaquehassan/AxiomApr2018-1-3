package com.axiom.labtask

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query

/**
 * Created by lenovo on 20/01/2019.
 */
@Dao
interface MyDao {
    @Insert
    fun insert(post: Post)

    @Query("SELECT * FROM Post")
    fun getAll(): List<Post>

}
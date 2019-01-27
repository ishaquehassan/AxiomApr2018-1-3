package com.axiom.labtask

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/**
 * Created by lenovo on 20/01/2019.
 */
@Entity
data class Post(@PrimaryKey val id: Int,
                @ColumnInfo val userId: Int,
                @ColumnInfo val title: String,
                @ColumnInfo val body: String) {
}
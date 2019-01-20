package com.axiom.roomdb

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/**
 * Created by lenovo on 20/01/2019.
 */
@Entity
data class Movies(
        @PrimaryKey(autoGenerate = true) val id: Int,
        @ColumnInfo var title: String,
        @ColumnInfo var desc: String
)
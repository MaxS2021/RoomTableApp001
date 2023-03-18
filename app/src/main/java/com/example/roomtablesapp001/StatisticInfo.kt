package com.example.roomtablesapp001

import androidx.room.ColumnInfo

data class StatisticInfo (
    var id: Int? = null,
    @ColumnInfo(name = "result_name") var result: String,
    @ColumnInfo(name = "difficulty_name") var difficult: String,
    var mistakes: Int,
    var points: Int
)

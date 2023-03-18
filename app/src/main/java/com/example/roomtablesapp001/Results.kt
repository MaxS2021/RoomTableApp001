package com.example.roomtablesapp001

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "results")
data class Results(
    @PrimaryKey var id: Int,
    @ColumnInfo(name = "result_name") var resultName: String

)

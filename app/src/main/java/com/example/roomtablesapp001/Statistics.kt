package com.example.roomtablesapp001

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "statistic",
    indices = [Index("id")],
    foreignKeys = [
        ForeignKey(entity = Results::class,
            parentColumns = ["id"],
            childColumns = ["result_id"]),
        ForeignKey(entity = DifficultyLevel::class,
            parentColumns = ["id"],
            childColumns = ["difficulty_id"])
    ]
)
data class Statistics(
    @PrimaryKey(autoGenerate = true) var id: Int? = null,
    @ColumnInfo(name = "result_id") var resultId: Int,
    @ColumnInfo(name = "difficulty_id") var difficultId: Int,
    var mistakes: Int,
    var points: Int

)

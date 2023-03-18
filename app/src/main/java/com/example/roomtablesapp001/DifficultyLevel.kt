package com.example.roomtablesapp001

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "difficulty_levels")
data class DifficultyLevel(
    @PrimaryKey var id: Int,
    @ColumnInfo(name = "difficulty_name") var difficultyName: String
)

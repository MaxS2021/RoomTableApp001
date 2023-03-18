package com.example.roomtablesapp001

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface Dao {
    @Insert(entity = Statistics::class)
    fun insertNewStatisticData(statistic: Statistics)

    @Query("SELECT statistic.id, result_name, difficulty_name, mistakes,points FROM statistic\n"+
    "INNER JOIN results ON statistic.result_id = results.id\n"+
    "INNER JOIN difficulty_levels ON statistic.difficulty_id = difficulty_levels.id;")
    fun getAllStatisticData():List<StatisticInfo>

    @Query("DELETE FROM statistic WHERE id = :statisticId")
    fun deleteStatisticDataById(statisticId: Int)
}
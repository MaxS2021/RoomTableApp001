package com.example.roomtablesapp001

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class StatisticRepository(private val statisticDao: Dao) {

    suspend fun insertNewStatisticData(statisticDbEntity: Statistics) {
        withContext(Dispatchers.IO) {
            statisticDao.insertNewStatisticData(statisticDbEntity)
        }
    }

    suspend fun getAllStatisticData(): List<StatisticInfo> {
        return withContext(Dispatchers.IO) {
            return@withContext statisticDao.getAllStatisticData()
        }
    }

    suspend fun removeStatisticDataById(id: Int) {
        withContext(Dispatchers.IO) {
            statisticDao.deleteStatisticDataById(id)
        }
    }
}
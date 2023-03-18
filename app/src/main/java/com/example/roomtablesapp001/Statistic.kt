package com.example.roomtablesapp001

data class Statistic(
    val resultId: Int,
    val difficultId: Int,
    val mistakes: Int,
    val points: Int
) {

    fun toStatisticDbEntity(): Statistics = Statistics(
        id = 0,
        resultId = resultId,
        difficultId = difficultId,
        mistakes = mistakes,
        points = points
    )
}

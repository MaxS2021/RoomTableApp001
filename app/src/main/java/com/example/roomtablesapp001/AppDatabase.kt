package com.example.roomtablesapp001

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    version = 1,
    entities = [
        DifficultyLevel::class,
        Results::class,
        Statistics::class
    ]
)
abstract class AppDatabase: RoomDatabase() {

    abstract fun getStatDao(): Dao

    companion object {
        fun getDB(context: Context): AppDatabase {
            return Room.databaseBuilder(
                context.applicationContext,
                AppDatabase::class.java,
                "database.db"
            ).createFromAsset("room_article.db")
                .build()
        }
    }
}
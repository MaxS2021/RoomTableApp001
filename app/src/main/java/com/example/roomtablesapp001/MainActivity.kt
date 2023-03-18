package com.example.roomtablesapp001

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.roomtablesapp001.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bind: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)

        val db = AppDatabase.getDB(this)

        bind.btSave.setOnClickListener {
            val item = Statistics(
                null,
                1, 1,
                bind.edMistake.text.toString().toInt(),
                bind.edPoint.text.toString().toInt()

            )
            Thread {
                db.getStatDao().insertNewStatisticData(item)
            }
            Toast.makeText(this, "Запись добавлена в базу", Toast.LENGTH_SHORT).show()
        }
    }
}
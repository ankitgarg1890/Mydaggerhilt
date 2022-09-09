package com.example.mydaggerhilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
 class MainActivity : AppCompatActivity() {
    private lateinit var couresList: RecyclerView

     private val viewModel:MainViewModel by viewModels()

     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        couresList = findViewById(R.id.course_list)
        couresList.layoutManager = LinearLayoutManager(this)

         observeCoures()
    }

    private fun observeCoures( ) {

        viewModel.course.observe(this) {
            couresList.adapter = CourseAdapter(it)
        }
    }
}
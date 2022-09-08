package com.example.mydaggerhilt

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
private val courseRepository: CourseRepository
):ViewModel(){

    private val courseTime= MutableLiveData<List<Course>>()
            val course:LiveData<List<Course>> = courseTime
    init {
        loadCryptocurrency()
    }
    private fun loadCryptocurrency() {
        courseTime.value = courseRepository.getCourse()
    }
}
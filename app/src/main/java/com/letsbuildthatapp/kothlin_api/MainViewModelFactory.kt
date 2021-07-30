package com.letsbuldthatapp.kothlin_api

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.letsbuldthatapp.kothlin_api.MainViewModel
import com.letsbuldthatapp.kothlin_api.repository.Repository

class MainViewModelFactory(private val repository: Repository): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MainViewModel(repository) as T
    }
}
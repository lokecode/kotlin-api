package com.letsbuldthatapp.kothlin_api.repository

import com.letsbuldthatapp.kothlin_api.api.RetrofitInstance
import com.example.retrofittest.model.Post
import retrofit2.Response

class Repository {

    suspend fun getPost(): Response<Post> {
        return RetrofitInstance.api.getPost()
    }

    suspend fun getPost2(number: Int): Response<Post> {
        return RetrofitInstance.api.getPost2(number)
    }
}
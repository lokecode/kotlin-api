package com.letsbuldthatapp.kothlin_api.api

import com.example.retrofittest.model.Post
import retrofit2.Response
import retrofit2.http.*

interface SimpleApi {

    @GET("posts/1")
    suspend fun getPost(): Response<Post>

    @GET("posts/{Number}")
    suspend fun  getPost2(
        @Path("postNumber") number: Int
    ): Response<Post>
}
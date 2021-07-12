package com.example.retrofittutorial

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiInterface {

    @GET("users/{user}")
    fun getUser(
        @Path("user") username: String
    ): Call<User>

    @GET("users/{user}/repos")
    fun getUserRepos(
        @Path("user") username: String
    ): Call<UserRepos>

}
package com.example.retrofittutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val api = RetrofitInstance.api

        api.getUser("immortalape").enqueue(object : Callback<User>{
            override fun onResponse(call: Call<User>, response: Response<User>) {
                Log.d("debug", "onResponse: ${response.body()}")
            }

            override fun onFailure(call: Call<User>, t: Throwable) {
                Log.e("debug", "onFailure: ${t.localizedMessage}")
            }
        })

    }
}
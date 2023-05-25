package com.example.loginretrofit

import android.content.Context

class ReqResAPI constructor(context: Context) {
    companion object{
        @Volatile
        private var INSTANCE: ReqResAPI? = null

        fun getInstance(context: Context) = INSTANCE?: synchronized(this){
            INSTANCE ?: ReqResAPI(context).also { INSTANCE = it }
        }
    }


}
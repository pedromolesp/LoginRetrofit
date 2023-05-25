package com.example.loginretrofit.retrofit

data class RegisterResponse(var id: String, var token: String) : SuccessResponse(token)

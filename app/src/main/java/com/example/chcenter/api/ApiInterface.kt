package com.example.chcenter.api

import com.example.chcenter.api.model.DoctorModelRequest
import com.example.chcenter.api.model.Request
import com.example.chcenter.api.model.Response
import com.example.chcenter.api.model.Users
import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiInterface {


    @POST("users")
    fun userRegistration(@Body params: Request): Observable<Response>


    @POST("doctors")
    fun doctorRegistration(@Body params: DoctorModelRequest): Observable<Response>


    @GET("users?page=2")
    fun getAllUserList(): Observable<Users>
}
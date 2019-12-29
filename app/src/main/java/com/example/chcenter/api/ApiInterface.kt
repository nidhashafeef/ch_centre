package com.example.chcenter.api

import com.example.chcenter.api.model.*
import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiInterface {


    @POST("users")
    fun userRegistration(@Body params: Request): Observable<Response>


    @POST("doctors")
    fun doctorRegistration(@Body params: DoctorModelRequest): Observable<DoctorModelResponse>

    @POST("volunteers")
    fun volunteerRegistration(@Body params: VolunteerModelRequest): Observable<VolunteerModelResponse>
    

    @GET("users?page=2")
    fun getAllUserList(): Observable<Users>

    @GET("getDocterDetailsData")
    fun docoterlistview():Observable<DoctorlistviewModels>

    @GET("getAmbulanceDetailsData")
    fun ambulancelistview():Observable<DoctorlistviewModels>

    @GET("getBloodGroupDetailsData")
    fun bloodgrouplistview():Observable<BloodGroplistviewModels>

    @GET("getFreezerDetailsData")
    fun freezerlistview():Observable<FreezerlistviewModels>

    @GET("getVolunteerDetailsData")
    fun volunteerlistview():Observable<VolunteerlistviewModels>


}
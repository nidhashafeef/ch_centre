package com.example.chcenter.api.model

data class DoctorlistviewModels (var docs:ArrayList<Doctors>)
data class Doctors(var strName:String,var strSpeciliazatiom:String,var strPlace:String,var strContactNumber:String,var createdAt:String)
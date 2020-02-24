package com.example.chcenter.models


data class AmbulanceModel(var Name: String, var Phoneno: String)

object Ambulancelist {
    val Ambulances = listOf(
        AmbulanceModel("anju", "8943608487"),
        AmbulanceModel("shifa", "8943608487"),
        AmbulanceModel("shefna", "8943608487"),
        AmbulanceModel("amrutha", "8943608487")


    )
}
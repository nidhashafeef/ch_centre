package com.example.chcenter.api.model

import java.io.Serializable


data class AmbulanceResponse(
    var name: String,
    var number: String,
    var id: String,
    var createdAt: String
) :
    Serializable

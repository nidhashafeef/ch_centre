package com.example.chcenter.api.model

import java.io.Serializable

data class FreezerResponse(
    var name: String,
    var phoneNumber: String
) : Serializable

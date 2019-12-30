package com.example.chcenter.api.model

import java.io.Serializable

data class FreezerRequest(
    var name: String,
    var phoneNumber: String
) : Serializable


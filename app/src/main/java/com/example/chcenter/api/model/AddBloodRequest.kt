package com.example.chcenter.api.model

import java.io.Serializable

data class AddBloodRequest(
    var name: String,
    var age: String,
    var bloodGroup: String,
    var lastDonate: String,
    var contact: String
) : Serializable

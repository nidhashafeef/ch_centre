package com.example.chcenter.api.model

data class BloodGroplistviewModels (var blodgrp:ArrayList<Bloodgroups>)
data class Bloodgroups(var strName:String,
                       var strContactNumber:String,
                       var createdAt:String)
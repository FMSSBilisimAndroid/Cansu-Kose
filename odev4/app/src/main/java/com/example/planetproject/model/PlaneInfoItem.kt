package com.example.planetproject.model


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class PlaneInfoItem(
    @SerializedName("id")
    @Expose
    val id: String,
    @SerializedName("img_src")
    @Expose
    val imgSrc: String,
    @SerializedName("price")
    @Expose
    val price: Int,
    @SerializedName("type")
    @Expose
    val type: String
)
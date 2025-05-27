package com.example.emtyapp.data.Entities

import com.google.gson.annotations.SerializedName

data class Product(
    @SerializedName("productID")
    val productId: String,
    @SerializedName("productTitle")
    val title : String? = null,
    @SerializedName("productDescription")
    val description: String? = null
)
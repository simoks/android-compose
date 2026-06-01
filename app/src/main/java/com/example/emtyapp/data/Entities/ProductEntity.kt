package com.example.emtyapp.data.Entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "product")
data class ProductEntity(
    @SerializedName("productID")
    @PrimaryKey val productId: String,
    @SerializedName("productTitle")
    val title : String? = null,
    @SerializedName("productDescription")
    val description: String? = null
)
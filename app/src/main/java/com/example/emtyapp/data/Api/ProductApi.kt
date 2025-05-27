package com.example.emtyapp.data.Api

import com.example.emtyapp.data.Entities.Product
import retrofit2.http.GET

interface ProductApi {
    @GET("products")
    suspend fun getProducts(): List<Product>
}
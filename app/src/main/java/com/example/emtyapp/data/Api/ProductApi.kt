package com.example.emtyapp.data.Api

import com.example.emtyapp.data.Entities.Product
import retrofit2.http.GET

interface ProductApi {
    @GET("products.json")
    suspend fun getProducts(): List<Product>
}
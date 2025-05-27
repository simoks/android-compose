package com.example.emtyapp.data.Repository

import com.example.emtyapp.data.Api.ProductApi
import com.example.emtyapp.data.Entities.Product
import kotlinx.coroutines.delay
import javax.inject.Inject

class ProductRepository @Inject constructor(
    private val api: ProductApi
) {
    suspend fun getProducts(): List<Product> {
        // fetch data from a remote server
        return api.getProducts()
    }
}
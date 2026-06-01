package com.example.emtyapp.data.Repository

import android.util.Log
import com.example.emtyapp.data.Api.ProductApi
import com.example.emtyapp.data.Entities.ProductEntity
import com.example.silentsmsreceiver.database.ProductDao
import javax.inject.Inject

class ProductRepository @Inject constructor(
    private val api: ProductApi,
    private val productDao: ProductDao
) {
    suspend fun getProducts(): List<ProductEntity> {
        // 1. Try to fetch from remote server
        try {
            val products = api.getProducts()
            Log.d("products repo", "Fetched from network, size: ${products.size}")
            
            // 2. Insert fetched products into the database (Cache)
            productDao.insertAll(products)
        } catch (e: Exception) {
            Log.e("products repo", "Failed to fetch from network, using cache", e)
        }

        // 3. Return the data from the database (Single Source of Truth)
        val productList = productDao.getAll()
        Log.d("My Products", "Returning productList from cache, size: ${productList.size}")
        return productList
    }
}
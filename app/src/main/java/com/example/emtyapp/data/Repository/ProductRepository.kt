package com.example.emtyapp.data.Repository

import com.example.emtyapp.data.Entities.Product
import kotlinx.coroutines.delay
import javax.inject.Inject

class ProductRepository @Inject constructor() {
    suspend fun getProducts(): List<Product> {
        // Simulate fetching data from a remote server or database
        delay(2000)
        return listOf(
            Product("1", "Smart TV", "Smart TV by Samsung, 42 inch"),
            Product("2", "iPhone 14", "iPhone 14"),
            Product("3", "iPad", "iPad Apple"),
            Product("4", "Samsung Galaxy 24", "Samsung Galaxy 24"),
            Product("5", "Smart TV", "Smart TV by Samsung, 42 inch"),
            Product("6", "iPhone 14", "iPhone 14"),
            Product("7", "iPad", "iPad Apple"),
            Product("8", "Samsung Galaxy 24", "Samsung Galaxy 24")
        )
    }
}
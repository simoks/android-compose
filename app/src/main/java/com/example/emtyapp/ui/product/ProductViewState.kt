package com.example.emtyapp.ui.product

import com.example.emtyapp.data.Entities.ProductEntity


data class  ProductViewState(
    val isLoading: Boolean = false,
    val products: List<ProductEntity> = emptyList(),
    val error: String? = null
)
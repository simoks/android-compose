package com.example.emtyapp.ui.product.component

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.emtyapp.data.Entities.ProductEntity


@Composable
fun ProductsList(products: List<ProductEntity>, onNavigateToDetails: (String) -> Unit) {
    LazyColumn (
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
    ){
        items(products) { product ->
            ProductItem(product, onNavigateToDetails)
        }
    }
}
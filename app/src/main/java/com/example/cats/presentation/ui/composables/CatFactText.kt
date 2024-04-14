package com.example.cats.presentation.ui.composables

import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.runtime.Composable
import androidx.compose.material3.Text

@Composable
fun CatFactText(text: String){
    Text(
        text = text,
        style = typography.bodyMedium
    )
}
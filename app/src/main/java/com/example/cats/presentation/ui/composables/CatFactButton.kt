package com.example.cats.presentation.ui.composables

import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.compose.material3.Button

@Composable
fun CatFactButton(codeForOnClick: () -> Unit){
    Button(onClick = codeForOnClick){
        Text(text = "Get a Cat Fact!")
    }
}
package com.example.cats.presentation.ui.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.material3.Surface
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier

@Composable
fun CatFactCard(text: String, onClick: () -> Unit){
    Surface(
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier.padding(8.dp)
    ){
        Column(
            modifier = Modifier.padding(16.dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            CatFactText(text = text)
            Spacer(modifier = Modifier.height(16.dp))
            CatFactButton(codeForOnClick = onClick)
        }
    }
}


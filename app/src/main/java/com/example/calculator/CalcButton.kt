package com.example.calculator

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp



@Composable
fun CalcButton(symbol: String,
               modifier: Modifier = Modifier,
               onClick: (String) -> Unit = {}) {
    Button(
        onClick = { onClick(symbol)} ,
        modifier = modifier
            .height(60.dp),
        shape = CircleShape,
        colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent)
    ) {
        Text(
            text = symbol,
            fontSize = 30.sp,
            color = Color.DarkGray
        )
    }
}

@Composable
fun CalcButton2(symbol: String,
               modifier: Modifier = Modifier,
               onClick: (String) -> Unit = {}) {
    Button(
        onClick = { onClick(symbol)} ,
        modifier = modifier
            .height(80.dp),
        shape = CircleShape,
        colors = ButtonDefaults.buttonColors(containerColor = Color.DarkGray)
    ) {
        Text(
            text = symbol,
            fontSize = 30.sp
        )
    }
}
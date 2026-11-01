package com.example.calculator

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Backspace
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel

@SuppressLint("UnrememberedMutableState")
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CalculatorScreen(viewModel: CalculatorViewModel = viewModel()) {

    val inputValue = viewModel.input

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Spacer(modifier = Modifier.height(40.dp))

        TextField(
            value = inputValue,
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth()
                .height(220.dp),
            readOnly = false,
            textStyle = TextStyle(
                fontSize = when {
                    inputValue.length <= 10 -> 40.sp
                    inputValue.length <= 15 -> 35.sp
                    inputValue.length <= 20 -> 30.sp
                    else -> 25.sp
                }, textAlign = TextAlign.End
            )
        )

        //Button

        Column {
            Spacer(modifier = Modifier.height(15.dp))

            Row {
                Spacer(modifier = Modifier.width(10.dp))
                CalcButton("√", modifier = Modifier.weight(1f), onClick = viewModel::onButtonClick)

                Spacer(modifier = Modifier.width(10.dp))
                CalcButton("π", modifier = Modifier.weight(1f),onClick = viewModel::onButtonClick)

                Spacer(modifier = Modifier.width(10.dp))
                CalcButton("^", modifier = Modifier.weight(1f),onClick = viewModel::onButtonClick)

                Spacer(modifier = Modifier.width(10.dp))
                CalcButton("!", modifier = Modifier.weight(1f),onClick = viewModel::onButtonClick)

                Spacer(modifier = Modifier.width(10.dp))
                CalcButton("e", modifier = Modifier.weight(1f),onClick = viewModel::onButtonClick)

                Spacer(modifier = Modifier.width(10.dp))
            }

            Spacer(modifier = Modifier.height(15.dp))

            Row {
                Spacer(modifier = Modifier.width(10.dp))
                CalcButton2("AC", modifier = Modifier,onClick = viewModel::onButtonClick)

                Spacer(modifier = Modifier.width(10.dp))
                CalcButton2("( )", modifier = Modifier.weight(1f),onClick = viewModel::onButtonClick)

                Spacer(modifier = Modifier.width(10.dp))
                CalcButton2("%", modifier = Modifier.weight(1f),onClick = viewModel::onButtonClick)

                Spacer(modifier = Modifier.width(10.dp))
                CalcButton2("÷", modifier = Modifier.weight(1f),onClick = viewModel::onButtonClick)

                Spacer(modifier = Modifier.width(10.dp))
            }

            Spacer(modifier = Modifier.height(15.dp))

            Row {
                Spacer(modifier = Modifier.width(10.dp))
                CalcButton2("1", modifier = Modifier.weight(1f),onClick = viewModel::onButtonClick)

                Spacer(modifier = Modifier.width(10.dp))
                CalcButton2("2", modifier = Modifier.weight(1f),onClick = viewModel::onButtonClick)

                Spacer(modifier = Modifier.width(10.dp))
                CalcButton2("3", modifier = Modifier.weight(1f),onClick = viewModel::onButtonClick)

                Spacer(modifier = Modifier.width(10.dp))
                CalcButton2("x", modifier = Modifier.weight(1f),onClick = viewModel::onButtonClick)

                Spacer(modifier = Modifier.width(10.dp))
            }

            Spacer(modifier = Modifier.height(15.dp))


            Row {
                Spacer(modifier = Modifier.width(10.dp))
                CalcButton2("4", modifier = Modifier.weight(1f),onClick = viewModel::onButtonClick)

                Spacer(modifier = Modifier.width(10.dp))
                CalcButton2("5", modifier = Modifier.weight(1f),onClick = viewModel::onButtonClick)

                Spacer(modifier = Modifier.width(10.dp))
                CalcButton2("6", modifier = Modifier.weight(1f),onClick = viewModel::onButtonClick)

                Spacer(modifier = Modifier.width(10.dp))
                CalcButton2("-", modifier = Modifier.weight(1f),onClick = viewModel::onButtonClick)

                Spacer(modifier = Modifier.width(10.dp))
            }

            Spacer(modifier = Modifier.height(15.dp))

            Row {
                Spacer(modifier = Modifier.width(10.dp))
                CalcButton2("7", modifier = Modifier.weight(1f),onClick = viewModel::onButtonClick)

                Spacer(modifier = Modifier.width(10.dp))
                CalcButton2("8", modifier = Modifier.weight(1f),onClick = viewModel::onButtonClick)

                Spacer(modifier = Modifier.width(10.dp))
                CalcButton2("9", modifier = Modifier.weight(1f),onClick = viewModel::onButtonClick)

                Spacer(modifier = Modifier.width(10.dp))
                CalcButton2("+", modifier = Modifier.weight(1f),onClick = viewModel::onButtonClick)

                Spacer(modifier = Modifier.width(10.dp))
            }

            Spacer(modifier = Modifier.height(15.dp))

            Row {
                Spacer(modifier = Modifier.width(10.dp))
                CalcButton2("0", modifier = Modifier.weight(1f),onClick = viewModel::onButtonClick)

                Spacer(modifier = Modifier.width(10.dp))
                CalcButton2(".", modifier = Modifier.weight(1f),onClick = viewModel::onButtonClick)
                Spacer(modifier = Modifier.width(10.dp))

                IconButton(
                    onClick = { viewModel.onButtonClick("DEL") },

                            modifier = Modifier
                        .weight(1f)
                        .size(80.dp)
                        .clip(CircleShape)
                        .background(Color.DarkGray),
                ) {
                    Icon(
                        imageVector = Icons.Outlined.Backspace,
                        contentDescription = "Delete",
                        tint = Color.White,
                        modifier = Modifier.size(28.dp)
                    )

                }


                Spacer(modifier = Modifier.width(10.dp))
                CalcButton2("=", modifier = Modifier.weight(1f),onClick = viewModel::onButtonClick)
                Spacer(modifier = Modifier.width(10.dp))
            }
        }
    }
}
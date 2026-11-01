package com.example.calculator

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import kotlin.math.sqrt

class CalculatorViewModel : ViewModel() {

    var input by mutableStateOf("")
        private set

    fun onButtonClick(symbol: String) {
        input = when (symbol) {
            "AC" -> ""
            "DEL" -> if (input.isNotEmpty()) input.dropLast(1) else ""
            "!" -> runCatching {
                val num = input.toInt()
                factorial(num).toString()
            }.getOrElse { "Error" }

            "√" -> runCatching {
                sqrt(input.toDouble()).toString()
            }.getOrElse { "Error" }

            "π" -> input + Math.PI.toString()
            "e" -> input + Math.E.toString()
            "^" -> input + "^"
            "÷" -> input + "/"
            "x" -> input + "*"
            "=" -> evaluateExpression(input)
            else -> input + symbol
        }
    }

    private fun factorial(n: Int): Long {
        return if (n <= 1) 1 else n * factorial(n - 1)
    }

    private fun evaluateExpression(expression: String): String {
        return try {
            val cleaned = expression.replace("^", "**")
            val result = calculateSimpleExpression(cleaned)
            result.toString()
        } catch (e: Exception) {
            "Error"
        }
    }

    private fun calculateSimpleExpression(expr: String): Double {
        return when {
            expr.contains("+") -> {
                val parts = expr.split("+", limit = 2)
                parts[0].toDouble() + parts[1].toDouble()
            }
            expr.contains("-") -> {
                // Handles negative numbers like -5+3
                val index = expr.indexOf("-", 1)
                if (index != -1) {
                    val a = expr.substring(0, index).toDouble()
                    val b = expr.substring(index + 1).toDouble()
                    a - b
                } else {
                    expr.toDouble()
                }
            }
            expr.contains("*") -> {
                val parts = expr.split("*", limit = 2)
                parts[0].toDouble() * parts[1].toDouble()
            }
            expr.contains("/") -> {
                val parts = expr.split("/", limit = 2)
                parts[0].toDouble() / parts[1].toDouble()
            }
            else -> expr.toDouble()
        }
    }
}

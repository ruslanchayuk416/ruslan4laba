package com.example.laba4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.laba4.ui.theme.LABA4Theme
import kotlin.math.pow

data class CalculationResult(
    val sum: Double,
    val lastTerm: Double,
    val iterations: Int
)

fun calculateSeries(x: Double, epsilon: Double): CalculationResult? {
    if (x == 0.0) return null

    var sum = 0.0
    var n = 0
    var term: Double

    do {
        val sign = if (n % 2 == 0) 1.0 else -1.0
        val denominator = (2 * n + 1) * x.pow((2 * n + 1).toDouble())
        term = sign / denominator
        sum += term
        n++
    } while (Math.abs(term) >= epsilon)

    return CalculationResult(sum, term, n)
}

@Preview(showBackground = true, widthDp = 360, heightDp = 700)
@Composable
fun Preview() {
    MaterialTheme {
        AppScreen()
    }
}

@Composable
fun AppScreen() {
    TODO("Not yet implemented")
}
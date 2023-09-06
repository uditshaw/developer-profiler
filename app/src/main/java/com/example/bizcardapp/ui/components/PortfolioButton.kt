package com.example.bizcardapp.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun PortfolioButton() {
    Button(onClick = { }, modifier = Modifier.padding(14.dp)) {
        Text(text = "PORTFOLIO", style = MaterialTheme.typography.labelLarge)
    }
}

@Preview
@Composable
fun PortfolioButtonPreview() {
    PortfolioButton()
}
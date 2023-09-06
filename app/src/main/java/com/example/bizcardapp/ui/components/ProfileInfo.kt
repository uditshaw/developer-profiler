package com.example.bizcardapp.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun ProfileInfo() {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Udit Shaw", style = TextStyle(fontSize = 32.sp, color = MaterialTheme.colorScheme.primary))
        Text(text = "SOFTWARE DEVELOPER", style = MaterialTheme.typography.bodyLarge)
        Text(text = "@bookmyshow", style = TextStyle(fontSize = 16.sp, color = MaterialTheme.colorScheme.onBackground))
    }
}

@Preview(showSystemUi = true)
@Composable
fun ProfileInfoPreview() {
    ProfileInfo()
}
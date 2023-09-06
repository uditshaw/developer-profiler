package com.example.bizcardapp.ui.appbar

import android.widget.Toast
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BizCardAppBar() {
    val localContext2 = LocalContext.current
    TopAppBar(
        title = { Text(text = "JetPack Biz Card") },
        navigationIcon = {
            IconButton(onClick = {
                Toast.makeText(
                    localContext2,
                    "Appbar Button Clicked",
                    Toast.LENGTH_LONG
                ).show()
            }) {
                Icon(Icons.Filled.ArrowBack, contentDescription = "backIcon")
            }
        },
        colors = TopAppBarDefaults.smallTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.primary,
            titleContentColor = Color.White
        )
    )
}

@Preview
@Composable
fun BizCardAppBarPreview() {
    BizCardAppBar()
}
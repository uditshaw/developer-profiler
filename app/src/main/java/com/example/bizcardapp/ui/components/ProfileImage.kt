package com.example.bizcardapp.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.bizcardapp.R

@Composable
fun ProfileImage() {
    Surface(
        tonalElevation = 16.dp,
        border = BorderStroke(1.dp, Color.Cyan),
        shape = CircleShape
    ) {
        Image(
            painter = painterResource(id = R.drawable.udit_image),
            contentDescription = "avatar",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(98.dp)
        )
    }
}
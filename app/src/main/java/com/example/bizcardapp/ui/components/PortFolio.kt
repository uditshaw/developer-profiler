package com.example.bizcardapp.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun PortFolio(projectNamesState: SnapshotStateList<String>) {

    Surface(
        modifier = Modifier.fillMaxSize(),
        border = BorderStroke(1.dp, color = Color.DarkGray),
        shape = RoundedCornerShape(8.dp)
    ) {
        LazyColumn(contentPadding = PaddingValues(horizontal = 8.dp)) {
            itemsIndexed(projectNamesState) { index, item ->
                Column(modifier = Modifier.padding(14.dp)) {
                    Text(text = "Project ${index + 1}")
                    Text(text = item, style = MaterialTheme.typography.titleMedium)
                }
                Divider()
            }
        }
    }


}

@Preview
@Composable
fun PortFolioPreview() {
    PortFolio(SnapshotStateList())
}
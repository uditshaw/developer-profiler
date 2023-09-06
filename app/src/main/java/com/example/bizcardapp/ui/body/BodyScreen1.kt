package com.example.bizcardapp.ui.body

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bizcardapp.ui.components.PortFolio
import com.example.bizcardapp.ui.components.PortfolioButton
import com.example.bizcardapp.ui.components.ProfileImage
import com.example.bizcardapp.ui.components.ProfileInfo

@Composable
fun BodyScreen1(projectNamesState: SnapshotStateList<String>) {
    Column {
        Card(
            shape = RoundedCornerShape(10.dp),
            elevation = CardDefaults.cardElevation(14.dp),
            //        colors = CardDefaults.elevatedCardColors(Color.Green),
            modifier = Modifier.padding(12.dp)
        ) {
            Surface(modifier = Modifier.fillMaxSize()) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(8.dp)
                ) {
                    ProfileImage()
                    Divider(modifier = Modifier.padding(vertical = 14.dp))
                    ProfileInfo()
                    PortfolioButton()
                    PortFolio(projectNamesState)
                }
            }
        }
    }
}

@Preview
@Composable
fun BodyScreen1Preview() {
    BodyScreen1(SnapshotStateList())
}
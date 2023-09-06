package com.example.bizcardapp.ui.screens

import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bizcardapp.ui.appbar.BizCardAppBar
import com.example.bizcardapp.ui.body.BodyScreen1

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    val localContext = LocalContext.current

    var projectNames = arrayListOf("Human Face Detection", "Expense Manager", "The Main App")

    var projectNamesState = remember {
        projectNames.toMutableStateList()
    }

    Scaffold(
        topBar = { BizCardAppBar() },
        bottomBar = {
            BottomAppBar(
                containerColor = MaterialTheme.colorScheme.primaryContainer,
                contentColor = MaterialTheme.colorScheme.primary
            ) {
                Text(
                    text = "Bottom App Bar",
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    fontSize = 16.sp
                )

            }
        },
        floatingActionButton = {
            FloatingActionButton(onClick = {
                Toast.makeText(
                    localContext,
                    "Compose Button Clicked",
                    Toast.LENGTH_SHORT
                ).show()
                projectNamesState.add("New Project 2")
            }) {
                Row(modifier = Modifier.padding(horizontal = 12.dp)) {
                    Icon(Icons.Default.AddCircle, contentDescription = "Add Icon")
                    Text(text = " Compose", fontSize = 15.sp)
                }
            }
        },
        floatingActionButtonPosition = FabPosition.End,
        content = {
            Box(
                modifier = Modifier
                    .padding(it)
                    .fillMaxSize()
                    .background(MaterialTheme.colorScheme.background)
            ) {
                BodyScreen1(projectNamesState)
            }
        })
}

@Preview
@Composable
fun MainScreenPreview() {
    MainScreen()
}
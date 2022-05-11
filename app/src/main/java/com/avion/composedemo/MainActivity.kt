package com.avion.composedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        Color.Green

                    ),
                horizontalAlignment = Alignment.CenterHorizontally, // X Axis
                verticalArrangement = Arrangement.SpaceAround //main axis for column i.e. Y
            ) {
                Text(text = "Hello ")
                Text(text = "World!")
                Text(text = "Hello ")

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(0.2f)
                        .background(
                            Color.Red

                        ),
                    horizontalArrangement = Arrangement.SpaceAround, //main axis for Row i.e. X Axis
                    verticalAlignment = Alignment.CenterVertically// Y - Axis cross axis
                ) {
                    Text(text = "Hello ")
                    Text(text = "World!")
                    Text(text = "Hello ")
                }
            }

        }
    }

}

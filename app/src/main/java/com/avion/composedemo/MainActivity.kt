package com.avion.composedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    .background(Color.Cyan)
                    .fillMaxWidth()
                    .fillMaxHeight(0.5f)
                    .border(10.dp, color = Color.Red)
                    .padding(10.dp)
                    .border(10.dp, color = Color.Green)
                    .padding(10.dp)
                    .border(10.dp, color = Color.Yellow)
                    .padding(20.dp)

            ) {
                Text(text = "Hello World!")
                Text(text = "What's up?", modifier = Modifier
                    .border(5.dp,color = Color.Blue)
                    .padding(10.dp)
                    .clickable {  }

                )
            }
        }
    }

}

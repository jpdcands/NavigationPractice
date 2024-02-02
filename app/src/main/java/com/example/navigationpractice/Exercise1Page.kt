package com.example.navigationpractice

import androidx.compose.foundation.layout.*
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun Exercise1Page() {

    var selectedOption by rememberSaveable { mutableStateOf("Option 1") }
    val options = listOf("Set 1", "Set 2", "Set 3", "Set 4")

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Exercise #1 Page", fontSize = 30.sp)

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            options.forEach { option ->
                Column(horizontalAlignment = Alignment.CenterHorizontally) { // Use Column for vertical arrangement
                    Text(text = option, modifier = Modifier.align(Alignment.CenterHorizontally)) // Center the text above the RadioButton
                    RadioButton(
                        selected = selectedOption == option,
                        onClick = { selectedOption = option } )
                }
            }
        }
    }
}

        @Preview(showBackground = true)
        @Composable
        fun PreviewExercise1Page() {
            Exercise1Page()
        }
package com.example.navigationpractice

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModel
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun Exercise1Page(navController: NavController, viewModel: ExerciseViewModel = viewModel()) {
    // Using the ViewModel's state
    val selectedOption by viewModel.selectedOption
    val options = viewModel.options

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
                    Text(
                        text = option,
                        modifier = Modifier.align(Alignment.CenterHorizontally)
                    ) // Center the text above the RadioButton
                    RadioButton(
                        selected = selectedOption == option,
                        onClick = { viewModel.selectedOption.value  = option }
                    )

                }
            }
        }
        Button(onClick = { navController.navigate("mainPage") }) {
            Text("Back to Main Page")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewExercise1Page() {
    val navController = rememberNavController()
    Exercise1Page(navController)
}
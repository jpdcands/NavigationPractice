package com.example.navigationpractice

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.lifecycle.ViewModel
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun Exercise1Page(navController: NavController, viewModel: ExerciseViewModel = viewModel()) {
    // Observe selectedOption state outside of RadioButton
    val selectedOption = viewModel.selectedOption.value

    val options = viewModel.options

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Exercise #1 Page", fontSize = 30.sp, fontWeight = FontWeight.Bold)

        Row(
            modifier = Modifier.fillMaxWidth(),
        ) {
            options.forEach { option ->
                Column(horizontalAlignment = Alignment.CenterHorizontally) { // Use Column for vertical arrangement
                    Text(
                        text = option,
                        modifier = Modifier.align(Alignment.CenterHorizontally)
                    ) // Center the text above the RadioButton
                    RadioButton(
                        selected = selectedOption == option,
                        onClick = { viewModel.updateSelectedOption(option) }
                    )
                }
            }
        }
        Column( // New Column for buttons
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(onClick = { navController.navigate("mainPage") }) {
                Text("Back to Main Page")
            }
            Spacer(modifier = Modifier.height(8.dp))
            // Space between buttons
            Button(onClick = { navController.navigate("exercise") }) {
                Text("Back to Exercise Page")
            }
            Spacer(modifier = Modifier.height(8.dp))
            // Space between buttons
            Button(onClick = {
                viewModel.clearSelectedOption()
                navController.navigate("exercise")
            }) {
                Text("Clear All Sets")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewExercise1Page() {
    val navController = rememberNavController()
    Exercise1Page(navController)
}
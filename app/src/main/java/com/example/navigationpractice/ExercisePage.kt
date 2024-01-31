package com.example.navigationpractice

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ExercisePage(navController: NavController) {
    Scaffold { paddingValues ->
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Exercise Page")
            Button(onClick = { navController.navigate("exercise1") }) {
                Text(text = "Go to Exercise #1 Page")
            }
        }
    }
}

@Composable
fun mockNavController() = rememberNavController()

@Preview(showBackground = true)
@Composable
fun ExercisePagePreview() {
    ExercisePage(navController = mockNavController())
}
package com.example.navigationpractice

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
@Composable
fun ExercisePage(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp), // Apply the padding from the Scaffold
        verticalArrangement = Arrangement.Top,// Align items to the top
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.weight(1f))
        // Place "Exercise Page" at the top, using Modifier.weight to push everything else down
        Text(
            text = "Exercise Page",
            style = TextStyle(fontSize = 30.sp, fontWeight = FontWeight.Bold),
            modifier = Modifier.padding(bottom = 8.dp)
        )
        Spacer(modifier = Modifier.weight(1f))
        // These buttons will be positioned closer to the bottom
        Button(onClick = { navController.navigate("exercise1") }) {
            Text(text = "Go to Exercise #1")
        }
        Button(onClick = { navController.navigate("exercise2") }) { // Assuming you intended to navigate to a different page here
            Text(text = "Go to Exercise #2")
        }
        Spacer(modifier = Modifier.weight(1f))
    }
}
@Composable
fun mockNavController() = rememberNavController()

@Preview(showBackground = true)
@Composable
fun ExercisePagePreview() {
    ExercisePage(navController = mockNavController())
}
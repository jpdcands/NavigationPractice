package com.example.navigationpractice

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController


@Composable
fun MainPage(navController: NavController) {
    Scaffold { paddingValues ->
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Main Page")
            Button(onClick = { navController.navigate("exercise") }) {
                Text(text = "Go to Exercise Page")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainPagePreview() {
    MainPage(navController = mockNavController())
}
package com.example.navigationpractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewModel: ExerciseViewModel by viewModels()

        setContent {
            MyApp(viewModel = viewModel)
        }
    }
}

enum class MyRouteApp() {
    MainPage,
    ExercisePage,
    Exercise1Page
}

@Composable
fun MyApp(viewModel: ExerciseViewModel) {

    val navController: NavHostController = rememberNavController()

    NavHost(navController = navController, startDestination = "mainPage") {
        composable("mainPage") {
            MainPage(navController, viewModel) }
        composable("exercise") {
            ExercisePage(navController, viewModel) }
        composable("exercise1") {
            Exercise1Page(navController, viewModel) }
    }
}


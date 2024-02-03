package com.example.navigationpractice

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.StateFlow

class ExerciseViewModel : ViewModel() {
    // Holds the current selection
    var selectedOption: MutableState<String> = mutableStateOf("Option 1")
        private set // Make the setter private to prevent modification from outside

    // The options to display
    val options = listOf("Set 1", "Set 2", "Set 3", "Set 4")
}


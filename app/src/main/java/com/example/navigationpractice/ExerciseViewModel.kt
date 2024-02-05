package com.example.navigationpractice

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.StateFlow
class ExerciseViewModel(private val savedStateHandle: SavedStateHandle) : ViewModel() {
    // Key for saving the selected option in the SavedStateHandle
    private val SELECTED_OPTION_KEY = "selected_option_key"

    // Initialize selectedOption from SavedStateHandle or default to "Option
    var selectedOption: MutableState<String> = mutableStateOf(
        savedStateHandle.get<String>(SELECTED_OPTION_KEY) ?: "Option 1"
    )
        private set // Make the setter private to prevent modification from outside
    init {
        // Observe changes to selectedOption and save them in SavedStateHandle
        selectedOption.value.let {
            savedStateHandle[SELECTED_OPTION_KEY] = it
        }
    }

    // Function to update selectedOption and save to SavedStateHandle
    fun updateSelectedOption(newOption: String) {
        selectedOption.value = newOption
        savedStateHandle[SELECTED_OPTION_KEY] = newOption
    }

    // The options to display
    val options = listOf("Set 1", "Set 2", "Set 3", "Set 4")
}


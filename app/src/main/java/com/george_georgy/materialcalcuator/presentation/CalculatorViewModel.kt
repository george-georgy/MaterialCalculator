package com.george_georgy.materialcalcuator.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.george_georgy.materialcalcuator.domain.CalculatorAction
import com.george_georgy.materialcalcuator.domain.ExpressionWriter

class CalculatorViewModel(
    private val writer: ExpressionWriter = ExpressionWriter()
) : ViewModel() {

    var expression by mutableStateOf("0.0")
        private set


    fun onAction(action: CalculatorAction) {
        writer.processAction(action)
        this.expression = writer.expression
    }
}
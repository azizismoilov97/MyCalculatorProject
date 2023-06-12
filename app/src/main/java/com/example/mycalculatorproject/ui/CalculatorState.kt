package com.example.mycalculatorproject.ui

import com.example.mycalculatorproject.CalculatorOperation

data class CalculatorState(
    val number1: String = "",
    val number2: String = "",
    val operation: CalculatorOperation? = null
)
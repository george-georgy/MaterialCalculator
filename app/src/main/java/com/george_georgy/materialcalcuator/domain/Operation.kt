package com.george_georgy.materialcalcuator.domain

enum class Operation(val symbol : Char) {
    ADD('+'),
    SUBTRACT('-'),
    MULTIPLY('x'),
    DIVIDE('/'),
    PERCENT('%'),
}


val operationSymbols = Operation.values().map { it.symbol }.joinToString("") // it return "+-x/%"

fun operationFromSymbol(symbol : Char) : Operation {
    return Operation.values().find { it.symbol == symbol }
        ?: throw IllegalArgumentException("Invalid symbol")
}
package com.example.bauman.android.lecture.sample

fun main() {
    val calculator = Calculator()
    while (true) {
        val input = readlnOrNull().orEmpty().split(" ")
        val command = input[0]

        when (command) {
            "set_balance" -> {
                val amount = input[1].toInt()
                calculator.setExactBalance(amount)
                println("Current balance: ${calculator.balance}")
            }
            "add_balance" -> {
                val amount = input[1].toInt()
                calculator.addBalance(amount)
                println("Current balance: ${calculator.balance}")
            }
            "add_expense" -> {
                val category = input[1]
                val amount = input[2].toInt()
                calculator.addExpense(category, amount)
                println("Current balance: ${calculator.balance}")
            }
            "list_expenses" -> {
                calculator.listExpenses().forEach { expense ->
                    println("Category: ${expense.category}, amount: ${expense.amount}")
                }
            }
            "exit" -> {
                break
            }
            else -> {
                println("Unknown command")
                continue
            }
        }
    }
}
package com.example.bauman.android.lecture.sample

class Calculator {

    var balance = 0
        private set
    private var expensesArrayOffset = 0
    private val expenses = arrayOfNulls<Expense>(100)

    fun setExactBalance(amount: Int) {
        balance = amount
    }

    fun addBalance(amount: Int) {
        balance += amount
    }

    fun addExpense(category: String, amount: Int) {
        balance -= amount
        expenses[expensesArrayOffset++] = Expense(category, amount)
    }

    fun listExpenses(): List<Expense> {
        return expenses.filterNotNull()
    }
}
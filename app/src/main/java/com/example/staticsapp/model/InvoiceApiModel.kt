package com.example.staticsapp.model

data class InvoiceApiModel(
    val invoiceNumber: Int,
    val customerName: String,
    val total: Int,
    val status: InvoiceStatus
)

enum class InvoiceStatus {
    Draft,
    Pending,
    Paid,
    BadDebt
}

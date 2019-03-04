package com.example.pla.kotlinmvvm_livedataviewmodel.viewmodel

import androidx.lifecycle.ViewModel
import com.example.pla.kotlinmvvm_livedataviewmodel.data.Quote
import com.example.pla.kotlinmvvm_livedataviewmodel.data.QuoteRepo

class QuoteViewModel (private val quoteRepo: QuoteRepo) : ViewModel() {

    fun addQuote(quote: Quote){

        quoteRepo.addQuote(quote)

    }

    fun getQuote() = quoteRepo.getQuote()

}
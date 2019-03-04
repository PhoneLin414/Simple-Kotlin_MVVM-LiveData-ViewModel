package com.example.pla.kotlinmvvm_livedataviewmodel.viewmodelfactory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.pla.kotlinmvvm_livedataviewmodel.data.QuoteRepo
import com.example.pla.kotlinmvvm_livedataviewmodel.viewmodel.QuoteViewModel

class QuoteViewModelFactory constructor(private val quoteRepo: QuoteRepo) : ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return QuoteViewModel(quoteRepo) as T
    }

}
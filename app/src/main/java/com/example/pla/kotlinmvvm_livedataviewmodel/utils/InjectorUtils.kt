package com.example.pla.kotlinmvvm_livedataviewmodel.utils

import com.example.pla.kotlinmvvm_livedataviewmodel.data.Database
import com.example.pla.kotlinmvvm_livedataviewmodel.data.QuoteRepo
import com.example.pla.kotlinmvvm_livedataviewmodel.viewmodelfactory.QuoteViewModelFactory

object InjectorUtils {

    fun factoryProvider() : QuoteViewModelFactory{


        val quoteRepo = QuoteRepo.getInstance(Database.getInstance().quoteDao)

        return QuoteViewModelFactory(quoteRepo)

    }

}
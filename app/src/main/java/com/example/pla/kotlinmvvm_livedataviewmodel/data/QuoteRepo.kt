package com.example.pla.kotlinmvvm_livedataviewmodel.data

class QuoteRepo private constructor(private val quoteDao: QuoteDao){


    companion object {
        @Volatile private var Instance :QuoteRepo? = null

        fun getInstance(quoteDao: QuoteDao) = Instance ?: synchronized(this){

            Instance ?: QuoteRepo(quoteDao).also { Instance = it }

        }
    }

    fun addQuote(quote: Quote){

        quoteDao.addQuote(quote)

    }


    fun getQuote() = quoteDao.getQuote()

}
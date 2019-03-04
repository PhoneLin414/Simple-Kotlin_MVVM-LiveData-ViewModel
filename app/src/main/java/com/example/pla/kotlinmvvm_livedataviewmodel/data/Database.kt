package com.example.pla.kotlinmvvm_livedataviewmodel.data

class Database{


    val quoteDao = QuoteDao()

    companion object {

        @Volatile private var Instance : Database? = null

        fun getInstance() = Instance ?: synchronized(this){

            Database().also { Instance = it }

        }



    }


}
package com.example.pla.kotlinmvvm_livedataviewmodel

import android.os.Bundle
import android.util.Log.i
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.pla.kotlinmvvm_livedataviewmodel.data.Quote
import com.example.pla.kotlinmvvm_livedataviewmodel.utils.InjectorUtils
import com.example.pla.kotlinmvvm_livedataviewmodel.viewmodel.QuoteViewModel
import kotlinx.android.synthetic.main.activity_quotes.*

class QuotesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quotes)


        val factory = InjectorUtils.factoryProvider()

        //val viewModel = factory.create(QuoteViewModel::class.java)

        val viewModel = ViewModelProviders.of(this,factory).get(QuoteViewModel::class.java)

        btn_add.setOnClickListener {

            viewModel.addQuote(Quote(edt_quote.text.toString(), edt_author.text.toString()))

        }

        viewModel.getQuote().observe(this, Observer { quotes -> quotes.forEach {

            quote -> i("Quotes",quote.quoteText+":"+quote.author)

        } })



    }


}

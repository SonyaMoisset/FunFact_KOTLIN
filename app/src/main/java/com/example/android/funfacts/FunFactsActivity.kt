package com.example.android.funfacts

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView

class FunFactsActivity : AppCompatActivity() {

    private val TAG = FunFactsActivity::class.java.simpleName
    private val factBook = FactBook()
    private val colorWheel = ColorWheel()
    private var factTextView: TextView? = null
    private var showFactButton: Button? = null
    private var relativeLayout: RelativeLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fun_facts)

        factTextView = findViewById(R.id.factTextView)
        showFactButton = findViewById(R.id.showFactButton)
        relativeLayout = findViewById(R.id.relativeLayout)

        showFactButton!!.setOnClickListener {
            val fact = factBook.getFact()
            val color = colorWheel.getColor()

            factTextView!!.text = fact
            relativeLayout!!.setBackgroundColor(color)
            showFactButton!!.setTextColor(color)
        }

        // Toast.makeText(this, "Yay! Our Activity was created!", Toast.LENGTH_LONG).show()
        Log.d(TAG, "We're logging from the onCreate() method!")
    }
}

package com.example.kotlinmadlib

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_display_message.*
import kotlinx.android.synthetic.main.activity_main.*

class DisplayMessageActivity : AppCompatActivity() {
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)
        val adjectiveOne = intent.getStringExtra("ADJECTIVE_1")
        adjective1.text = "It was a " + adjectiveOne + ", cold November day."
        val adjectiveTwo = intent.getStringExtra("ADJECTIVE_2")
        adjective2.text = "I woke up to the " + adjectiveTwo + " smell of "
        val nounOne = intent.getStringExtra("NOUN_1")
        noun1.text = nounOne + " roasting in the "
        val nounTwo = intent.getStringExtra("NOUN_2")
        noun2.text = nounTwo + " downstairs."
        val verbOne = intent.getStringExtra("VERB_1")
        verb1.text = "I " + verbOne + " down the stairs to see "
        val verbTwo = intent.getStringExtra("VERB_2")
        verb2.text = " if I could " + verbTwo + " the dinner."
        val nounThree = intent.getStringExtra("NOUN_3")
        noun3.text = "My mom said, 'See if " +nounThree
        val nounFour = intent.getStringExtra("NOUN_4")
        noun4.text = "needs a fresh " +nounFour +"'."
    }
}

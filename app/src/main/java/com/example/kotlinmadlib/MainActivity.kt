package com.example.kotlinmadlib

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendMessage(view: View) {
        val editText = findViewById<EditText>(R.id.edit_message)
        val editText2 = findViewById<EditText>(R.id.edit_message2)
        val editText3 = findViewById<EditText>(R.id.edit_message3)
        val editText4 = findViewById<EditText>(R.id.edit_message4)
        val editText5 = findViewById<EditText>(R.id.edit_message5)
        val editText6 = findViewById<EditText>(R.id.edit_message6)
        val editText7 = findViewById<EditText>(R.id.edit_message7)
        val editText8 = findViewById<EditText>(R.id.edit_message8)
        val message = editText.text.toString()
        val message2 = editText2.text.toString()
        val message3 = editText3.text.toString()
        val message4 = editText4.text.toString()
        val message5 = editText5.text.toString()
        val message6 = editText6.text.toString()
        val message7 = editText7.text.toString()
        val message8 = editText8.text.toString()
        val intent = Intent(this, DisplayMessageActivity::class.java)
        intent.putExtra("ADJECTIVE_1", message)
        intent.putExtra("ADJECTIVE_2", message2)
        intent.putExtra("NOUN_1", message3)
        intent.putExtra("NOUN_2", message4)
        intent.putExtra("VERB_1", message5)
        intent.putExtra("VERB_2", message6)
        intent.putExtra("NOUN_3", message7)
        intent.putExtra("NOUN_4", message8)
        if(message.trim().isEmpty()||message2.trim().isEmpty()||message3.trim().isEmpty()||message4.trim().isEmpty()||message5.trim().isEmpty()||message6.trim().isEmpty()||message7.trim().isEmpty()||message8.trim().isEmpty()){
            val toast = Toast.makeText(this, "Please fill out all fields!", Toast.LENGTH_SHORT)
            toast.show()
        }
        else {
            startActivity(intent)
        }
    }
}
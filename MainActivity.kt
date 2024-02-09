package com.example.palindromechecker

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var inputText: EditText = findViewById(R.id.palindromeInputTextID)
        inputText.addTextChangedListener(object: TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
            override fun afterTextChanged(p0: Editable?) {

                var inputText: EditText = findViewById(R.id.palindromeInputTextID)

                var inputTextcheck = inputText.text.toString()

                if(inputTextcheck == inputTextcheck.reversed())
                {
                    var textChange: TextView = findViewById<TextView>(R.id.palindromeCheckID)
                            textChange.setTextColor(Color.parseColor("#90EE90"))
                    textChange.setText("This is a Palindrome")
                }
                else if(inputTextcheck != inputTextcheck.reversed())
                {
                    var textChange: TextView = findViewById<TextView>(R.id.palindromeCheckID)
                    textChange.setTextColor(Color.parseColor("#EE4B2B"))
                    textChange.setText("This is not a Palindrome")
                }

            }

        }


        )


    }

}
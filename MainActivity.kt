package com.han.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import  com.han.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)




    }


    fun myPlus(view: View){

        val number1 = binding.numberEditText.text.toString().toDoubleOrNull()
        val number2 = binding.numberEditText2.text.toString().toDoubleOrNull()

        if ( number1 != null && number2 != null){
            val result = number1 + number2

            binding.resultTextView.text = "Result : ${result}"

        }else {
            binding.resultTextView.text = "You can't enter an empty value!"
        }


    }


    fun myMinus(view: View){


        val number1 = binding.numberEditText.text.toString().toDoubleOrNull()
        val number2 = binding.numberEditText2.text.toString().toDoubleOrNull()

        if ( number1 != null && number2 != null){
            val result = number1 - number2

            binding.resultTextView.text = "Result : ${result}"

        }else {
            binding.resultTextView.text = "You can't enter an empty value!"
        }

    }

    fun myMulti(view: View){


        val number1 = binding.numberEditText.text.toString().toDoubleOrNull()
        val number2 = binding.numberEditText2.text.toString().toDoubleOrNull()

        if ( number1 != null && number2 != null){
            val result = number1 * number2

            binding.resultTextView.text = "Result : ${result}"

        }else {
            binding.resultTextView.text = "You can't enter an empty value!"
        }

    }


    fun myPart(view: View){

        val number1 = binding.numberEditText.text.toString().toDoubleOrNull()
        val number2 = binding.numberEditText2.text.toString().toDoubleOrNull()

        if ( number1 != null && number2 != null){
            val result = number1 / number2

            binding.resultTextView.text = "Result : ${result}"

        }else {
            binding.resultTextView.text = "You can't enter an empty value!"
        }




    }



}
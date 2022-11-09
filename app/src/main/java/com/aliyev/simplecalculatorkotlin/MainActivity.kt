package com.aliyev.simplecalculatorkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    lateinit var myString : String
    var number1 : Int? = null
    var number2 : Int? = null
    var result : Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun mySum(view : View) {

        number1 = num1.text.toString().toIntOrNull()
        number2 = num2.text.toString().toIntOrNull()

        if ( number1 == null || number2 == null){
            myResult.text ="Error! Not number!"
        }
        else{
            result = number1!! + number2!!
            myResult.text = "Res: $result"
        }


    }

    fun myMin(view : View) {
        number1 = num1.text.toString().toIntOrNull()
        number2 = num2.text.toString().toIntOrNull()

        if ( number1 == null || number2 == null){
            myResult.text ="Error! Not number!"
        }
        else{
            result = number1!! - number2!!
            myResult.text = "Res: $result"
        }
    }

    fun myMul(view : View) {

        number1 = num1.text.toString().toIntOrNull()
        number2 = num2.text.toString().toIntOrNull()

        if ( number1 == null || number2 == null){
            myResult.text ="Error! Not number!"
        }
        else{
            result = number1!! * number2!!
            myResult.text = "Res: $result"
        }
    }

    fun myDiv(view : View) {
        number1 = num1.text.toString().toIntOrNull()
        number2 = num2.text.toString().toIntOrNull()

        if ( number1 == null || number2 == null){
            myResult.text = "Error! Not number!"
        }
        else{
            result = number1!! / number2!!
            myResult.text = "Res: $result"
        }
    }


}
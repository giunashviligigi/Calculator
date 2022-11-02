package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var  resultTextView: TextView
    private var operand:Double = 0.0
    private var operation:String = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultTextView = findViewById(R.id.resultTextView)

    }
    fun numberClick(Clickedview: View){

        if (Clickedview is TextView) {

            val number:String = Clickedview.text.toString()
            val resultText:String = resultTextView.text.toString()

            resultTextView.text = resultText + number


        }


    }
    fun operationClick (view: View){
        if(view is TextView){
            var result: String = resultTextView.text.toString()

            if (result.isNotEmpty()) {

                this.operand = result.toDouble()

            }

            resultTextView.text = ""
            this.operation = view.text.toString()

        }


    }
    fun equalsClick (view: View) {

        val secOperandText: String = resultTextView.text.toString()
        var secOperand: Double = 0.0
        if(secOperandText.isNotEmpty()) {
            secOperand = secOperandText.toDouble()

        }
        when (this.operation) {
            "+" -> resultTextView.text = (operand + secOperand).toString()
            "-" -> resultTextView.text = (operand - secOperand).toString()
            "*" -> resultTextView.text = (operand * secOperand).toString()
            "/" -> resultTextView.text = (operand / secOperand).toString()





        }

    }






}
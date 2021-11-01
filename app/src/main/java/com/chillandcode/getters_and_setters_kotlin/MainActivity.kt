package com.chillandcode.getters_and_setters_kotlin

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var logMessages: String = ""

    //TODO 1 here we use get and set
    private var name: String = "Vishnu"
        get() = "Hi $field"
        set(value) {
            field = "My name is $value"
        }

    private var classTeacher: String = ""// the get and set functions have to be defined right after the declaration of the variable
        get() = field//the normal get function
        set(value) {
            field = value
        }//the normal set function


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //ignore this => only for log
        append(
            " In kotlin assigning a value to variable calls setter function passing the assigned value as the value parameter\n and the usage of the variable anywhere calls the getter function and returns the value of the field as it is ... \nThe setter and getter \nprivate var name: String = \"Vishnu\"\n" +
                    "        get() = \"Hi \$field\"\n" +
                    "        set(value) {\n" +
                    "            field = \"My name is \$value\"\n" +
                    "        } \n" +
                    "field refers to the out put \n & value refers to the input argument" +
                    "\n"
        )
        //ignore this => only for log
        append("The value of original string was\nVishnu ")
        append("*****************************")
        append("However the returned value from the setter will be :\n $name")
        append("*****************************")

        //TODO 2 here we update the value => this assignment calls the setter method.. in this case our custom setter will ran and the field value will be updated as defined by ourselves
        name = "John" /* */

        append("If we use the set or assign another value to the variable the set function wil execute and the value will be updated\nname=\"John\"\n\n result will be\n $name ")

    }

    //ignore this => only for log
    private fun append(message: String) {
        logMessages += "\n $message"
        findViewById<TextView>(R.id.textView).text = logMessages
    }
}
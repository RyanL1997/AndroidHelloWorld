package com.example.myfirstapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val are lke final in Java (can't reassign)
        val string = "hello world"
        //string = "new stuff"//doesn't work

        //var can be reassigned
        var string2: String? = "creating variables"
        string2 = "new stuff"
        string2 = null
    }

        private fun getStringLength(string: String?): Int{
            return string?.length?:0//same as below
            //if(string != null){
            //    return string.length
            //}
            //return 0
    }
}


package com.huskar.kotlin.kotlindemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        my_textview.text = "hello kotlin"
        my_textview.setOnClickListener {
            Toast.makeText(this,"hello kotlin",Toast.LENGTH_LONG).show()
            b();
        }
    }
    fun MainActivity.b() {
        this.my_textview.setText("hello fun b")
    }
}

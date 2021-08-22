package com.zasa.lsitviewapp

import android.content.Context
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ListView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.main_listView)

        listView.adapter = MyCustomAdaptor(this) //custom adaptor for listview
    }

    private class MyCustomAdaptor(context: Context) : BaseAdapter(){


        private val mContext : Context

        init {
            mContext = context
        }

        //responsible for how many list for my listview
        override fun getCount(): Int {
            return 5
        }

        //also ignore this
        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        //ignore this for now
        override fun getItem(position: Int): Any {
            return "Test String"
        }

        //responsible for rendering for each row
        override fun getView(position : Int, convertview : View?, viewGroup: ViewGroup?): View {
            val textView = TextView(mContext)
            textView.text = "here is my first text for my text view"
            return textView
        }
    }
}
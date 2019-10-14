package com.uty.listview_lab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.R.layout.simple_list_item_1
import android.widget.ArrayAdapter
import android.widget.Toast
//import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //data yang akan di tampilkan ke dalam list view
        val languages= listOf("kotlin","python","ruby","javascript","php")

        //memberikan adapter ke listview

        list_view.adapter=ArrayAdapter(this, simple_list_item_1,languages)

        //menampilkan item yang di klik
        list_view.setOnItemLongClickListener { parent, view, position, id ->
            Toast.makeText(this, "Anda memilih:${languages[position]}", Toast.LENGTH_SHORT).show()
        }
    }
}

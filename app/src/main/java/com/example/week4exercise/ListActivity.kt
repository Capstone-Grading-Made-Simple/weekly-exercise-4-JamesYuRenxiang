package com.example.week4exercise

import androidx.appcompat.app.AppCompatActivity

class ListActivity : AppCompatActivity(), UserAdapter.OnItemClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

    }
}
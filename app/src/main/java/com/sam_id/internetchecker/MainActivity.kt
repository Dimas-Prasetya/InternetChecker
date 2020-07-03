package com.sam_id.internetchecker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val networkConnection = NetworkConnection(applicationContext)
        networkConnection.observe(this, Observer { isConnected ->
            if (isConnected) {
                disconnected_layout.visibility = View.GONE
                connected_layout.visibility = View.VISIBLE
            } else {
                connected_layout.visibility = View.GONE
                disconnected_layout.visibility = View.VISIBLE
            }
        })
    }
}
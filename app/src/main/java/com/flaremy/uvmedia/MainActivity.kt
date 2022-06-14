package com.flaremy.uvmedia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btn_loguin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_loguin = findViewById(R.id.bt_loguin)

        btn_loguin.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, Start_interactive::class.java))
            finish()
        })
    }

}
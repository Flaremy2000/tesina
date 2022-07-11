package com.flaremy.uvmedia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import com.github.anastr.speedviewlib.SpeedView
import com.github.anastr.speedviewlib.Speedometer
import kotlin.random.Random

class Start_interactive : AppCompatActivity() {

    lateinit var speed:SpeedView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_interactive)

        speed = findViewById(R.id.uv_meter)

        val rangos = mutableListOf(1.0f, 2.0f,3.0f,4.0f,5.0f,6.0f,7.0f,8.0f,9.0f,10.0f,11.0f,12.0f)

        val mainHandler = Handler(Looper.myLooper()!!).postDelayed ({
            speed.speedTo(rangos.randomOrNull()!!, 1000)
        }, 1000)
    }



    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater:MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){
            R.id.profile_menu ->{
                startActivity(Intent(this, profile::class.java))
                true
            }
            R.id.report_menu ->{
                startActivity(Intent(this, reports::class.java))
                true
            }
            R.id.config_menu->{
                startActivity(Intent(this, config::class.java))
                true
            }
            R.id.logout_menu->{
                startActivity(Intent(this, MainActivity::class.java))
                finish()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
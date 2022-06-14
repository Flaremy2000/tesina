package com.flaremy.uvmedia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem

class Start_interactive : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_interactive)
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
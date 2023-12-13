package com.example.fishaccompanyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import com.example.fishaccompanyapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
       binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.continentsBtnNavView.setOnNavigationItemReselectedListener{
            true
            when(it.itemId){

                R.id.europe -> {}

                R.id.asia -> {}

                R.id.africa -> {}

                R.id.america -> {}
            }
        }
    }

  // logic of button karas
    fun onClickKaras(view: View){
        val intent = Intent(this, KarasActivity::class.java)
        startActivityForResult(intent, 1)
        var SendDATA = intent.putExtra("KarasInfo", 1)

    }
  // logic of button karp
    fun onClickKarp(view: View){
        val intent = Intent(this, KarpActivity::class.java)
        startActivityForResult(intent, 2)
    }
    // logic of Okun
    fun onClickOkun(view: View){
        val intent = Intent(this, OkunActivity::class.java)
        startActivityForResult(intent, 3)
    }


}
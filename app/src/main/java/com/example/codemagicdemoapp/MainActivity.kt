package com.example.codemagicdemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.example.codemagicdemoapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val TAG: String = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        initValue()
    }

    private fun initValue() {
        binding.tvLabel.text = "Static Polymorphism: ${add(1, 2)}"
    }

    private fun add(arg1: Int, arg2: Int): Int {
        return (arg1 + arg2)
    }

    private fun add(arg1: Int, name: String): String {
        return "$name-$arg1"
    }

    private fun add(arg1: Int, arg2: Int, arg3: Int): Int {
        return (arg1 + arg2 + arg3)
    }
}
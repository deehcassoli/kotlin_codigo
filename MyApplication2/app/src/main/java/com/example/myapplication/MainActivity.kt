package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity(), View.OnClickListener
{
    private lateinit var binding: ActivityMainBinding
    private lateinit var securityPreferences: SegurityPreferences
    private var filter: Int = MotivationConstants.PHRASEFILTER.GERAL
    private val mock: Mock = Mock()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
    }
}
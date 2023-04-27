package com.geektech.hw_2_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geektech.hw_2_6.databinding.ActivitySelectedBinding

class SelectedActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySelectedBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySelectedBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
package com.geektech.hw_2_6

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geektech.hw_2_6.MainActivity.Companion.MA_SA
import com.geektech.hw_2_6.databinding.ActivitySelectedBinding

class SelectedActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySelectedBinding
    private lateinit var adapter: PhotoAdapter
    private var list: ArrayList<Photo> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySelectedBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initAdapter()
        initGetExtra()
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun initGetExtra() {
        val getExtra = intent.getSerializableExtra(MA_SA) as? ArrayList<Photo>
        if (getExtra != null) {
            list.addAll(getExtra)
            adapter.notifyDataSetChanged()
        }
    }

    private fun initAdapter() {
        adapter = PhotoAdapter(list,
            clickListener = { },
            deleteItem = { }
        )
        binding.recyclerView.adapter = adapter
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun onBackPressed() {
        super.onBackPressed()
        list.clear()
        adapter.notifyDataSetChanged()
        finish()
    }
}
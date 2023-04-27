package com.geektech.hw_2_6

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.geektech.hw_2_6.databinding.ItemPhotoBinding

class SelectedAdapter(private val list: ArrayList<Photo>) :
    Adapter<SelectedAdapter.SelectedViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SelectedViewHolder {
        return SelectedViewHolder(
            ItemPhotoBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: SelectedViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount() = list.size

    inner class SelectedViewHolder(private val binding: ItemPhotoBinding) :
        ViewHolder(binding.root) {
        fun bind(photo: Photo) {
            Glide.with(binding.ivPhoto).load(photo.photo).into(binding.ivPhoto)
        }
    }
}
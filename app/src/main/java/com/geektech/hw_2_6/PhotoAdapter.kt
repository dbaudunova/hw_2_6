package com.geektech.hw_2_6

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.geektech.hw_2_6.databinding.ItemPhotoBinding

class PhotoAdapter(private val list: ArrayList<Photo>) : Adapter<PhotoAdapter.PhotoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotoViewHolder {
        return PhotoViewHolder(
            ItemPhotoBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: PhotoViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount() = list.size

    inner class PhotoViewHolder(private var binding: ItemPhotoBinding) : ViewHolder(binding.root) {
        fun bind(photo: Photo) {
            Glide.with(binding.ivPhoto).load(photo.photo).into(binding.ivPhoto)
        }
    }
}
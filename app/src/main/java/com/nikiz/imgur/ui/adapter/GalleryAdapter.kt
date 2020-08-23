package com.nikiz.imgur.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.nikiz.domain.model.GalleryModel
import com.nikiz.imgur.R

class GalleryAdapter: ListAdapter<GalleryModel, GalleryAdapter.GalleryViewHolder>(GalleryDiffCallback()) {

    lateinit var onThemeClickListener: (Int, String) -> Unit

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GalleryViewHolder {
        return GalleryViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.gallery_data_item, parent, false))
    }

    override fun onBindViewHolder(holder: GalleryViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class GalleryViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var authorName: TextView = itemView.findViewById(R.id.authorName)
        var authorAvatar: ImageView = itemView.findViewById(R.id.authorAvatar)
        var publicationTime: TextView = itemView.findViewById(R.id.publicationTime)
        var postTitle: TextView = itemView.findViewById(R.id.title)
        var postCover: ImageView = itemView.findViewById(R.id.postCover)

        fun bind(model: GalleryModel) {
            authorName.text = model.accountUrl
//            Glide.with(authorAvatar.context).load(model.authorAvatarLink).into(authorAvatar)
            Glide.with(postCover.context).load(model.cover).into(postCover)
            publicationTime.text = model.datetime.toString()
            postTitle.text = model.title
//            itemView.setOnClickListener {
//                onThemeClickListener.invoke(category.id, category.name)
//            }
        }
    }

    class GalleryDiffCallback: DiffUtil.ItemCallback<GalleryModel>() {
        override fun areItemsTheSame(oldItem: GalleryModel, newItem: GalleryModel): Boolean {
            return oldItem.id == newItem.id
        }
        override fun areContentsTheSame(oldItem: GalleryModel, newItem: GalleryModel): Boolean {
            return oldItem.id == newItem.id
        }
    }
}
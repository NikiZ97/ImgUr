package com.nikiz.imgur.ui.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.mikepenz.fastadapter.FastAdapter
import com.mikepenz.fastadapter.items.AbstractItem
import com.nikiz.domain.model.GalleryModel
import com.nikiz.imgur.R

open class GalleryItem: AbstractItem<GalleryItem.ViewHolder>() {
    var authorName: String? = null
    var authorAvatarLink: String? = null
    var publicationTime: String? = null
    var postTitle: String? = null
    var postCoverUrl: String? = null

    override val layoutRes: Int
        get() = R.layout.gallery_data_item

    override val type: Int
        get() = R.id.fastadapter_sample_item_id

    class ViewHolder(view: View): FastAdapter.ViewHolder<GalleryItem>(view) {
        var authorName: TextView = view.findViewById(R.id.authorName)
        var authorAvatar: ImageView = view.findViewById(R.id.authorAvatar)
        var publicationTime: TextView = view.findViewById(R.id.publicationTime)
        var postTitle: TextView = view.findViewById(R.id.title)
        var postCover: ImageView = view.findViewById(R.id.postCover)

        override fun bindView(item: GalleryItem, payloads: List<Any>) {
            authorName.text = item.authorName
            Glide.with(authorAvatar.context).load(item.authorAvatarLink).into(authorAvatar)
            Glide.with(postCover.context).load(item.postCoverUrl).into(postCover)
            publicationTime.text = item.publicationTime
            postTitle.text = item.postTitle
        }

        override fun unbindView(item: GalleryItem) {
            authorName.text = null
            publicationTime.text = null
            postTitle.text = null
        }

    }

    override fun getViewHolder(v: View): ViewHolder {
        return ViewHolder(v)
    }
}
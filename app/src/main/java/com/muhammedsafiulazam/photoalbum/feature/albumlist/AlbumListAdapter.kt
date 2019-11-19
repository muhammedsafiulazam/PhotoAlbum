package com.muhammedsafiulazam.photoalbum.feature.albumlist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.muhammedsafiulazam.photoalbum.R
import com.muhammedsafiulazam.photoalbum.feature.albumlist.model.Album

/**
 * Created by Muhammed Safiul Azam on 19/11/2019.
 */

class AlbumListAdapter(val albumList: MutableList<Album>, val albumListListener: IAlbumListListener) : RecyclerView.Adapter<AlbumListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumListViewHolder {
        return AlbumListViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.layout_album_item, parent, false),
            albumListListener
        )
    }

    override fun getItemCount(): Int {
        return albumList.size
    }

    override fun onBindViewHolder(holder: AlbumListViewHolder, position: Int) {
        val album: Album = albumList.get(position);
        holder.bind(album)
    }
}
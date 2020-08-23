package com.nikiz.imgur.ui.fragment.gallery

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.mikepenz.fastadapter.FastAdapter
import com.mikepenz.fastadapter.adapters.ItemAdapter
import com.nikiz.domain.usecase.DataState
import com.nikiz.imgur.R
import com.nikiz.imgur.ui.adapter.GalleryAdapter
import com.nikiz.imgur.ui.adapter.GalleryItem
import com.nikiz.imgur.ui.fragment.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.feed_fragment.*

@AndroidEntryPoint
class GalleryFragment : BaseFragment(R.layout.feed_fragment) {

    private val viewModel: GalleryViewModel by viewModels()

    companion object {
        fun newInstance() = GalleryFragment()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel.getDefaultGallery()
    }

    override fun subscribeUi() {
        viewModel.defaultGallery.observe(viewLifecycleOwner, Observer { dataState ->
            when (dataState) {
                is DataState.Success -> {
                    progress.visibility = View.GONE
                    Log.d("gallery-test", "Успешно получена галерея")
                    val galleryAdapter = GalleryAdapter()
                    gallery.layoutManager = LinearLayoutManager(requireContext())
                    galleryAdapter.submitList(dataState.data)
                    gallery.adapter = galleryAdapter
                }
                is DataState.Loading -> {
                    progress.visibility = View.VISIBLE
                }
                is DataState.Error -> {
                    progress.visibility = View.GONE
                    Toast.makeText(requireContext(), "Произошла ошибка: ${dataState.exception}",
                        Toast.LENGTH_SHORT).show()
                }
            }
        })
    }

}
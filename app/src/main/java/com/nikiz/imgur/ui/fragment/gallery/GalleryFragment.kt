package com.nikiz.imgur.ui.fragment.gallery

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.nikiz.domain.usecase.DataState
import com.nikiz.imgur.R
import com.nikiz.imgur.ui.fragment.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.feed_fragment.*
import kotlin.random.Random

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
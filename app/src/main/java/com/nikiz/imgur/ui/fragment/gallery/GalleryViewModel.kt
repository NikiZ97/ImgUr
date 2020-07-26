package com.nikiz.imgur.ui.fragment.gallery

import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.nikiz.domain.model.GalleryModel
import com.nikiz.domain.usecase.DataState
import com.nikiz.domain.usecase.GetDefaultGalleryUseCase
import com.nikiz.imgur.utils.SingleLiveEvent
import kotlinx.coroutines.launch


class GalleryViewModel @ViewModelInject constructor(
    @Assisted private val savedStateHandle: SavedStateHandle,
    private val defaultGalleryUseCase: GetDefaultGalleryUseCase) : ViewModel() {

    private val _defaultGallery = SingleLiveEvent<DataState<List<GalleryModel>>>()

    val defaultGallery: LiveData<DataState<List<GalleryModel>>> = _defaultGallery

    fun getDefaultGallery() {
        viewModelScope.launch {
            _defaultGallery.value = defaultGalleryUseCase.getDefaultGallery()
        }
    }
}
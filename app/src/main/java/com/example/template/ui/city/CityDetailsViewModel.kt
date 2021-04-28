package com.example.template.ui.city

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.template.base.BaseViewModel
import com.example.template.domain.entity.popular.CityEntity
import com.example.template.domain.usecase.cities.CitiesUseCase

import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CityDetailsViewModel @Inject constructor(
    private val cityUseCase: CitiesUseCase
): BaseViewModel() {

    private val _city = MutableLiveData<CityEntity>()
    val city: LiveData<CityEntity> = _city

    fun setCityId(id: Long) {
        viewModelScope.launch(Dispatchers.IO) {
            val res = cityUseCase.getCity(id)
            if (res != null) _city.postValue(res)
            else setErrorMessage("Not found")
        }
    }

}
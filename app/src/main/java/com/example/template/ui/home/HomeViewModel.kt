package com.example.template.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.template.base.BaseViewModel
import com.example.template.common.SingleLiveEvent
import com.example.template.domain.common.MResult
import com.example.template.domain.entity.popular.CityEntity
import com.example.template.domain.entity.popular.FoodEntity
import com.example.template.domain.usecase.cities.CitiesUseCase
import com.example.template.domain.usecase.fetchdata.UpdateListUseCase
import com.example.template.domain.usecase.foods.FoodsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val updateListUseCase: UpdateListUseCase,
    private val citiesUseCase: CitiesUseCase,
    private val foodsUseCase: FoodsUseCase,
) : BaseViewModel() {

    private val _list = MutableLiveData<CitiesAndFoods>()
    val list: LiveData<CitiesAndFoods> = _list

    init {
        fetchData()
    }

    private fun fetchData() {
        viewModelScope.launch(Dispatchers.IO) {
            val cities = citiesUseCase.getCities()
            val foods = foodsUseCase.getFoods()
            if (foods.isNullOrEmpty().not() || cities.isNullOrEmpty().not()) {
                _list.postValue(CitiesAndFoods(cities, foods))
            } else {
                checkForNewData()
            }
        }
    }

    private fun checkForNewData() {
        viewModelScope.launch(Dispatchers.IO) {
            when (val res = updateListUseCase.updateCitiesAndFoods()) {
                is MResult.Success -> {
                    val cities = citiesUseCase.getCities()
                    val foods = foodsUseCase.getFoods()
                    _list.postValue(CitiesAndFoods(cities, foods))
                }
                is MResult.Error -> {
                    withContext(Dispatchers.Main) {
                        setErrorMessage(res.errorMessage)
                    }
                }
                else -> {
                    withContext(Dispatchers.Main) {
                        setErrorMessage("Error")
                    }
                }
            }
        }
    }

    fun refreshRequested() {
        checkForNewData()
    }
}

data class CitiesAndFoods(
    val cities: List<CityEntity>,
    val foods: List<FoodEntity>,
)
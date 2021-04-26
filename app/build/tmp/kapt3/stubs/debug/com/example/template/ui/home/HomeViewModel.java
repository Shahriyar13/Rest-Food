package com.example.template.ui.home;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u000e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0012J\u000e\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0012J\u0006\u0010\u001d\u001a\u00020\u0018R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/example/template/ui/home/HomeViewModel;", "Lcom/example/template/base/BaseViewModel;", "updateListUseCase", "Lcom/example/template/domain/usecase/fetchdata/UpdateListUseCase;", "citiesUseCase", "Lcom/example/template/domain/usecase/cities/CitiesUseCase;", "foodsUseCase", "Lcom/example/template/domain/usecase/foods/FoodsUseCase;", "(Lcom/example/template/domain/usecase/fetchdata/UpdateListUseCase;Lcom/example/template/domain/usecase/cities/CitiesUseCase;Lcom/example/template/domain/usecase/foods/FoodsUseCase;)V", "_list", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/template/ui/home/CitiesAndFoods;", "list", "Landroidx/lifecycle/LiveData;", "getList", "()Landroidx/lifecycle/LiveData;", "navigateToCityDetails", "Lcom/example/template/common/SingleLiveEvent;", "", "getNavigateToCityDetails", "()Lcom/example/template/common/SingleLiveEvent;", "navigateToFoodDetails", "getNavigateToFoodDetails", "fetchData", "", "onCityClicked", "cityId", "onFoodClicked", "foodId", "refreshRequested", "app_debug"})
public final class HomeViewModel extends com.example.template.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.template.common.SingleLiveEvent<java.lang.Long> navigateToCityDetails = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.template.common.SingleLiveEvent<java.lang.Long> navigateToFoodDetails = null;
    private final androidx.lifecycle.MutableLiveData<com.example.template.ui.home.CitiesAndFoods> _list = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.template.ui.home.CitiesAndFoods> list = null;
    private final com.example.template.domain.usecase.fetchdata.UpdateListUseCase updateListUseCase = null;
    private final com.example.template.domain.usecase.cities.CitiesUseCase citiesUseCase = null;
    private final com.example.template.domain.usecase.foods.FoodsUseCase foodsUseCase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.template.common.SingleLiveEvent<java.lang.Long> getNavigateToCityDetails() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.template.common.SingleLiveEvent<java.lang.Long> getNavigateToFoodDetails() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.template.ui.home.CitiesAndFoods> getList() {
        return null;
    }
    
    private final void fetchData() {
    }
    
    public final void onCityClicked(long cityId) {
    }
    
    public final void onFoodClicked(long foodId) {
    }
    
    public final void refreshRequested() {
    }
    
    @javax.inject.Inject()
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    com.example.template.domain.usecase.fetchdata.UpdateListUseCase updateListUseCase, @org.jetbrains.annotations.NotNull()
    com.example.template.domain.usecase.cities.CitiesUseCase citiesUseCase, @org.jetbrains.annotations.NotNull()
    com.example.template.domain.usecase.foods.FoodsUseCase foodsUseCase) {
        super();
    }
}
package com.example.template.ui.city;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/example/template/ui/city/CityDetailsViewModel;", "Lcom/example/template/base/BaseViewModel;", "cityUseCase", "Lcom/example/template/domain/usecase/cities/CitiesUseCase;", "(Lcom/example/template/domain/usecase/cities/CitiesUseCase;)V", "_city", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/template/domain/entity/popular/CityEntity;", "city", "Landroidx/lifecycle/LiveData;", "getCity", "()Landroidx/lifecycle/LiveData;", "setCityId", "", "id", "", "app_debug"})
public final class CityDetailsViewModel extends com.example.template.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<com.example.template.domain.entity.popular.CityEntity> _city = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.template.domain.entity.popular.CityEntity> city = null;
    private final com.example.template.domain.usecase.cities.CitiesUseCase cityUseCase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.template.domain.entity.popular.CityEntity> getCity() {
        return null;
    }
    
    public final void setCityId(long id) {
    }
    
    @javax.inject.Inject()
    public CityDetailsViewModel(@org.jetbrains.annotations.NotNull()
    com.example.template.domain.usecase.cities.CitiesUseCase cityUseCase) {
        super();
    }
}
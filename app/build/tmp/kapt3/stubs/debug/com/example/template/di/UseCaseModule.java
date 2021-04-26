package com.example.template.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007\u00a8\u0006\u000f"}, d2 = {"Lcom/example/template/di/UseCaseModule;", "", "()V", "provideCitiesUseCase", "Lcom/example/template/domain/usecase/cities/CitiesUseCase;", "citiesRepository", "Lcom/example/template/domain/repository/cities/CitiesRepository;", "provideFoodsUseCase", "Lcom/example/template/domain/usecase/foods/FoodsUseCase;", "foodsRepository", "Lcom/example/template/domain/repository/foods/FoodsRepository;", "provideUpdateListUseCase", "Lcom/example/template/domain/usecase/fetchdata/UpdateListUseCase;", "updateListRepository", "Lcom/example/template/domain/repository/feature_a/UpdateListRepository;", "app_debug"})
@dagger.Module()
public final class UseCaseModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.template.domain.usecase.fetchdata.UpdateListUseCase provideUpdateListUseCase(@org.jetbrains.annotations.NotNull()
    com.example.template.domain.repository.feature_a.UpdateListRepository updateListRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.template.domain.usecase.cities.CitiesUseCase provideCitiesUseCase(@org.jetbrains.annotations.NotNull()
    com.example.template.domain.repository.cities.CitiesRepository citiesRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.template.domain.usecase.foods.FoodsUseCase provideFoodsUseCase(@org.jetbrains.annotations.NotNull()
    com.example.template.domain.repository.foods.FoodsRepository foodsRepository) {
        return null;
    }
    
    public UseCaseModule() {
        super();
    }
}
package com.example.template.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J \u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0007\u00a8\u0006\u000f"}, d2 = {"Lcom/example/template/di/Repository;", "", "()V", "provideCitiesRepository", "Lcom/example/template/domain/repository/cities/CitiesRepository;", "citiesLocalDataSource", "Lcom/example/template/data/datasource/cities/CitiesLocalDataSource;", "provideFoodsRepository", "Lcom/example/template/domain/repository/foods/FoodsRepository;", "foodsLocalDataSource", "Lcom/example/template/data/datasource/foods/FoodsLocalDataSource;", "provideSampleRepository", "Lcom/example/template/domain/repository/feature_a/UpdateListRepository;", "remoteDataSource", "Lcom/example/template/data/datasource/updatelist/FoodsAndCitiesRemoteDataSource;", "app_debug"})
@dagger.Module()
public final class Repository {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.template.domain.repository.feature_a.UpdateListRepository provideSampleRepository(@org.jetbrains.annotations.NotNull()
    com.example.template.data.datasource.cities.CitiesLocalDataSource citiesLocalDataSource, @org.jetbrains.annotations.NotNull()
    com.example.template.data.datasource.foods.FoodsLocalDataSource foodsLocalDataSource, @org.jetbrains.annotations.NotNull()
    com.example.template.data.datasource.updatelist.FoodsAndCitiesRemoteDataSource remoteDataSource) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.template.domain.repository.cities.CitiesRepository provideCitiesRepository(@org.jetbrains.annotations.NotNull()
    com.example.template.data.datasource.cities.CitiesLocalDataSource citiesLocalDataSource) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.template.domain.repository.foods.FoodsRepository provideFoodsRepository(@org.jetbrains.annotations.NotNull()
    com.example.template.data.datasource.foods.FoodsLocalDataSource foodsLocalDataSource) {
        return null;
    }
    
    public Repository() {
        super();
    }
}
package com.example.template.data.repository.popular;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/example/template/data/repository/popular/UpdateListRepositoryImpl;", "Lcom/example/template/domain/repository/feature_a/UpdateListRepository;", "citiesLocalDataSource", "Lcom/example/template/data/datasource/cities/CitiesLocalDataSource;", "foodsLocalDataSource", "Lcom/example/template/data/datasource/foods/FoodsLocalDataSource;", "remoteDataSource", "Lcom/example/template/data/datasource/updatelist/FoodsAndCitiesRemoteDataSource;", "(Lcom/example/template/data/datasource/cities/CitiesLocalDataSource;Lcom/example/template/data/datasource/foods/FoodsLocalDataSource;Lcom/example/template/data/datasource/updatelist/FoodsAndCitiesRemoteDataSource;)V", "fetchFoodsAndCitiesData", "Lcom/example/template/domain/common/MResult;", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
public final class UpdateListRepositoryImpl implements com.example.template.domain.repository.feature_a.UpdateListRepository {
    private final com.example.template.data.datasource.cities.CitiesLocalDataSource citiesLocalDataSource = null;
    private final com.example.template.data.datasource.foods.FoodsLocalDataSource foodsLocalDataSource = null;
    private final com.example.template.data.datasource.updatelist.FoodsAndCitiesRemoteDataSource remoteDataSource = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object fetchFoodsAndCitiesData(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.template.domain.common.MResult<java.lang.Boolean>> p0) {
        return null;
    }
    
    public UpdateListRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.example.template.data.datasource.cities.CitiesLocalDataSource citiesLocalDataSource, @org.jetbrains.annotations.NotNull()
    com.example.template.data.datasource.foods.FoodsLocalDataSource foodsLocalDataSource, @org.jetbrains.annotations.NotNull()
    com.example.template.data.datasource.updatelist.FoodsAndCitiesRemoteDataSource remoteDataSource) {
        super();
    }
}
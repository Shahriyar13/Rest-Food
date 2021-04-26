package com.example.template.data.usecase.cities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u001b\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/example/template/data/usecase/cities/CitiesUseCaseImpl;", "Lcom/example/template/domain/usecase/cities/CitiesUseCase;", "citiesRepository", "Lcom/example/template/domain/repository/cities/CitiesRepository;", "(Lcom/example/template/domain/repository/cities/CitiesRepository;)V", "getCities", "", "Lcom/example/template/domain/entity/popular/CityEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCity", "id", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
public final class CitiesUseCaseImpl implements com.example.template.domain.usecase.cities.CitiesUseCase {
    private final com.example.template.domain.repository.cities.CitiesRepository citiesRepository = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getCities(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.template.domain.entity.popular.CityEntity>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getCity(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.template.domain.entity.popular.CityEntity> p1) {
        return null;
    }
    
    public CitiesUseCaseImpl(@org.jetbrains.annotations.NotNull()
    com.example.template.domain.repository.cities.CitiesRepository citiesRepository) {
        super();
    }
}
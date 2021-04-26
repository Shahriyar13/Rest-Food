package com.example.template.data.datasource.updatelist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0006"}, d2 = {"Lcom/example/template/data/datasource/updatelist/FoodsAndCitiesRemoteDataSource;", "Lcom/example/template/data/datasource/BaseDataSource;", "getFoodsAndCities", "Lcom/example/template/domain/common/MResult;", "Lcom/example/template/data/remote/dto/response/FoodsAndCitiesResDTO;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
public abstract interface FoodsAndCitiesRemoteDataSource extends com.example.template.data.datasource.BaseDataSource {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getFoodsAndCities(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.template.domain.common.MResult<com.example.template.data.remote.dto.response.FoodsAndCitiesResDTO>> p0);
}
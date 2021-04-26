package com.example.template.data.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u0002H\u0005\u0018\u00010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/example/template/data/common/Converter;", "", "()V", "createFromResponse", "Lcom/example/template/domain/common/MResult;", "T", "response", "Lretrofit2/Response;", "data_debug"})
public final class Converter {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.template.data.common.Converter INSTANCE = null;
    
    /**
     * use this if server response data not modified (use whole body as data)
     */
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>com.example.template.domain.common.MResult<T> createFromResponse(@org.jetbrains.annotations.Nullable()
    retrofit2.Response<T> response) {
        return null;
    }
    
    private Converter() {
        super();
    }
}
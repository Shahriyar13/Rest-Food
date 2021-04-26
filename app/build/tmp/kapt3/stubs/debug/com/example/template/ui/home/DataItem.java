package com.example.template.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0007\b\t\nB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\u000b\f\r\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/example/template/ui/home/DataItem;", "", "()V", "id", "", "getId", "()J", "CityHeader", "CityItem", "FoodHeader", "FoodItem", "Lcom/example/template/ui/home/DataItem$CityItem;", "Lcom/example/template/ui/home/DataItem$FoodItem;", "Lcom/example/template/ui/home/DataItem$CityHeader;", "Lcom/example/template/ui/home/DataItem$FoodHeader;", "app_debug"})
public abstract class DataItem {
    
    public abstract long getId();
    
    private DataItem() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/example/template/ui/home/DataItem$CityItem;", "Lcom/example/template/ui/home/DataItem;", "city", "Lcom/example/template/domain/entity/popular/CityEntity;", "(Lcom/example/template/domain/entity/popular/CityEntity;)V", "getCity", "()Lcom/example/template/domain/entity/popular/CityEntity;", "id", "", "getId", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class CityItem extends com.example.template.ui.home.DataItem {
        private final long id = 0L;
        @org.jetbrains.annotations.NotNull()
        private final com.example.template.domain.entity.popular.CityEntity city = null;
        
        @java.lang.Override()
        public long getId() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.template.domain.entity.popular.CityEntity getCity() {
            return null;
        }
        
        public CityItem(@org.jetbrains.annotations.NotNull()
        com.example.template.domain.entity.popular.CityEntity city) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.template.domain.entity.popular.CityEntity component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.template.ui.home.DataItem.CityItem copy(@org.jetbrains.annotations.NotNull()
        com.example.template.domain.entity.popular.CityEntity city) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/example/template/ui/home/DataItem$FoodItem;", "Lcom/example/template/ui/home/DataItem;", "food", "Lcom/example/template/domain/entity/popular/FoodEntity;", "(Lcom/example/template/domain/entity/popular/FoodEntity;)V", "getFood", "()Lcom/example/template/domain/entity/popular/FoodEntity;", "id", "", "getId", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class FoodItem extends com.example.template.ui.home.DataItem {
        private final long id = 0L;
        @org.jetbrains.annotations.NotNull()
        private final com.example.template.domain.entity.popular.FoodEntity food = null;
        
        @java.lang.Override()
        public long getId() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.template.domain.entity.popular.FoodEntity getFood() {
            return null;
        }
        
        public FoodItem(@org.jetbrains.annotations.NotNull()
        com.example.template.domain.entity.popular.FoodEntity food) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.template.domain.entity.popular.FoodEntity component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.template.ui.home.DataItem.FoodItem copy(@org.jetbrains.annotations.NotNull()
        com.example.template.domain.entity.popular.FoodEntity food) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/template/ui/home/DataItem$CityHeader;", "Lcom/example/template/ui/home/DataItem;", "()V", "id", "", "getId", "()J", "app_debug"})
    public static final class CityHeader extends com.example.template.ui.home.DataItem {
        private static final long id = -9223372036854775808L;
        @org.jetbrains.annotations.NotNull()
        public static final com.example.template.ui.home.DataItem.CityHeader INSTANCE = null;
        
        @java.lang.Override()
        public long getId() {
            return 0L;
        }
        
        private CityHeader() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/template/ui/home/DataItem$FoodHeader;", "Lcom/example/template/ui/home/DataItem;", "()V", "id", "", "getId", "()J", "app_debug"})
    public static final class FoodHeader extends com.example.template.ui.home.DataItem {
        private static final long id = -9223372036854775807L;
        @org.jetbrains.annotations.NotNull()
        public static final com.example.template.ui.home.DataItem.FoodHeader INSTANCE = null;
        
        @java.lang.Override()
        public long getId() {
            return 0L;
        }
        
        private FoodHeader() {
            super();
        }
    }
}
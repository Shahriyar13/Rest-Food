package com.example.template.data.locale;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.example.template.data.locale.TypeConverter.class})
@androidx.room.Database(entities = {com.example.template.data.locale.entity.CityData.class, com.example.template.data.locale.entity.FoodData.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/example/template/data/locale/MDatabase;", "Landroidx/room/RoomDatabase;", "()V", "cityDao", "Lcom/example/template/data/locale/dao/CityDao;", "foodDao", "Lcom/example/template/data/locale/dao/FoodDao;", "data_debug"})
public abstract class MDatabase extends androidx.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.template.data.locale.dao.CityDao cityDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.template.data.locale.dao.FoodDao foodDao();
    
    public MDatabase() {
        super();
    }
}
// Generated by Dagger (https://dagger.dev).
package com.example.template.di;

import com.example.template.data.datasource.updatelist.FoodsAndCitiesRemoteDataSource;
import com.example.template.data.remote.api.FoodsAndCitiesApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DataSourceModule_ProvideSampleRemoteDataSourceFactory implements Factory<FoodsAndCitiesRemoteDataSource> {
  private final DataSourceModule module;

  private final Provider<FoodsAndCitiesApi> foodsAndCitiesApiProvider;

  public DataSourceModule_ProvideSampleRemoteDataSourceFactory(DataSourceModule module,
      Provider<FoodsAndCitiesApi> foodsAndCitiesApiProvider) {
    this.module = module;
    this.foodsAndCitiesApiProvider = foodsAndCitiesApiProvider;
  }

  @Override
  public FoodsAndCitiesRemoteDataSource get() {
    return provideSampleRemoteDataSource(module, foodsAndCitiesApiProvider.get());
  }

  public static DataSourceModule_ProvideSampleRemoteDataSourceFactory create(
      DataSourceModule module, Provider<FoodsAndCitiesApi> foodsAndCitiesApiProvider) {
    return new DataSourceModule_ProvideSampleRemoteDataSourceFactory(module, foodsAndCitiesApiProvider);
  }

  public static FoodsAndCitiesRemoteDataSource provideSampleRemoteDataSource(
      DataSourceModule instance, FoodsAndCitiesApi foodsAndCitiesApi) {
    return Preconditions.checkNotNullFromProvides(instance.provideSampleRemoteDataSource(foodsAndCitiesApi));
  }
}
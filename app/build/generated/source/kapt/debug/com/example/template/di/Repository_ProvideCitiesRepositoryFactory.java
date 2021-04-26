// Generated by Dagger (https://dagger.dev).
package com.example.template.di;

import com.example.template.data.datasource.cities.CitiesLocalDataSource;
import com.example.template.domain.repository.cities.CitiesRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class Repository_ProvideCitiesRepositoryFactory implements Factory<CitiesRepository> {
  private final Repository module;

  private final Provider<CitiesLocalDataSource> citiesLocalDataSourceProvider;

  public Repository_ProvideCitiesRepositoryFactory(Repository module,
      Provider<CitiesLocalDataSource> citiesLocalDataSourceProvider) {
    this.module = module;
    this.citiesLocalDataSourceProvider = citiesLocalDataSourceProvider;
  }

  @Override
  public CitiesRepository get() {
    return provideCitiesRepository(module, citiesLocalDataSourceProvider.get());
  }

  public static Repository_ProvideCitiesRepositoryFactory create(Repository module,
      Provider<CitiesLocalDataSource> citiesLocalDataSourceProvider) {
    return new Repository_ProvideCitiesRepositoryFactory(module, citiesLocalDataSourceProvider);
  }

  public static CitiesRepository provideCitiesRepository(Repository instance,
      CitiesLocalDataSource citiesLocalDataSource) {
    return Preconditions.checkNotNullFromProvides(instance.provideCitiesRepository(citiesLocalDataSource));
  }
}

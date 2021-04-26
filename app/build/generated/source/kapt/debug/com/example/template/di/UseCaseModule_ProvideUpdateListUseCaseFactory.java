// Generated by Dagger (https://dagger.dev).
package com.example.template.di;

import com.example.template.domain.repository.feature_a.UpdateListRepository;
import com.example.template.domain.usecase.fetchdata.UpdateListUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class UseCaseModule_ProvideUpdateListUseCaseFactory implements Factory<UpdateListUseCase> {
  private final UseCaseModule module;

  private final Provider<UpdateListRepository> updateListRepositoryProvider;

  public UseCaseModule_ProvideUpdateListUseCaseFactory(UseCaseModule module,
      Provider<UpdateListRepository> updateListRepositoryProvider) {
    this.module = module;
    this.updateListRepositoryProvider = updateListRepositoryProvider;
  }

  @Override
  public UpdateListUseCase get() {
    return provideUpdateListUseCase(module, updateListRepositoryProvider.get());
  }

  public static UseCaseModule_ProvideUpdateListUseCaseFactory create(UseCaseModule module,
      Provider<UpdateListRepository> updateListRepositoryProvider) {
    return new UseCaseModule_ProvideUpdateListUseCaseFactory(module, updateListRepositoryProvider);
  }

  public static UpdateListUseCase provideUpdateListUseCase(UseCaseModule instance,
      UpdateListRepository updateListRepository) {
    return Preconditions.checkNotNullFromProvides(instance.provideUpdateListUseCase(updateListRepository));
  }
}

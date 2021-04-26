// Generated by Dagger (https://dagger.dev).
package com.example.template.di;

import android.content.Context;
import com.example.template.data.locale.MDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DatabaseModule_ProvideMDatabaseFactory implements Factory<MDatabase> {
  private final DatabaseModule module;

  private final Provider<Context> contextProvider;

  public DatabaseModule_ProvideMDatabaseFactory(DatabaseModule module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public MDatabase get() {
    return provideMDatabase(module, contextProvider.get());
  }

  public static DatabaseModule_ProvideMDatabaseFactory create(DatabaseModule module,
      Provider<Context> contextProvider) {
    return new DatabaseModule_ProvideMDatabaseFactory(module, contextProvider);
  }

  public static MDatabase provideMDatabase(DatabaseModule instance, Context context) {
    return Preconditions.checkNotNullFromProvides(instance.provideMDatabase(context));
  }
}

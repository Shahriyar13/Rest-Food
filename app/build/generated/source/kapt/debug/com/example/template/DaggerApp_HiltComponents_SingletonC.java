// Generated by Dagger (https://dagger.dev).
package com.example.template;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.example.template.data.datasource.cities.CitiesLocalDataSource;
import com.example.template.data.datasource.foods.FoodsLocalDataSource;
import com.example.template.data.datasource.updatelist.FoodsAndCitiesRemoteDataSource;
import com.example.template.data.locale.MDatabase;
import com.example.template.data.locale.dao.CityDao;
import com.example.template.data.locale.dao.FoodDao;
import com.example.template.data.remote.api.FoodsAndCitiesApi;
import com.example.template.di.ApplicationModule;
import com.example.template.di.DataSourceModule;
import com.example.template.di.DataSourceModule_ProvideCityLocalDataSourceFactory;
import com.example.template.di.DataSourceModule_ProvideFoodLocalDataSourceFactory;
import com.example.template.di.DataSourceModule_ProvideSampleRemoteDataSourceFactory;
import com.example.template.di.DatabaseModule;
import com.example.template.di.DatabaseModule_ProvideCityDaoFactory;
import com.example.template.di.DatabaseModule_ProvideFoodDaoFactory;
import com.example.template.di.DatabaseModule_ProvideMDatabaseFactory;
import com.example.template.di.NetworkModule;
import com.example.template.di.NetworkModule_ProvideFoodsAndCitiesApiFactory;
import com.example.template.di.NetworkModule_ProvideGsonFactory;
import com.example.template.di.NetworkModule_ProvideOkHttpClientFactory;
import com.example.template.di.NetworkModule_ProvideRetrofitFactory;
import com.example.template.di.Repository;
import com.example.template.di.Repository_ProvideCitiesRepositoryFactory;
import com.example.template.di.Repository_ProvideFoodsRepositoryFactory;
import com.example.template.di.Repository_ProvideSampleRepositoryFactory;
import com.example.template.di.UseCaseModule;
import com.example.template.di.UseCaseModule_ProvideCitiesUseCaseFactory;
import com.example.template.di.UseCaseModule_ProvideFoodsUseCaseFactory;
import com.example.template.di.UseCaseModule_ProvideUpdateListUseCaseFactory;
import com.example.template.domain.repository.cities.CitiesRepository;
import com.example.template.domain.repository.feature_a.UpdateListRepository;
import com.example.template.domain.repository.foods.FoodsRepository;
import com.example.template.domain.usecase.cities.CitiesUseCase;
import com.example.template.domain.usecase.fetchdata.UpdateListUseCase;
import com.example.template.domain.usecase.foods.FoodsUseCase;
import com.example.template.ui.MainActivity;
import com.example.template.ui.city.CityDetailsFragment;
import com.example.template.ui.city.CityDetailsViewModel;
import com.example.template.ui.city.CityDetailsViewModel_HiltModules_KeyModule_ProvideFactory;
import com.example.template.ui.home.HomeFragment;
import com.example.template.ui.home.HomeViewModel;
import com.example.template.ui.home.HomeViewModel_HiltModules_KeyModule_ProvideFactory;
import com.google.gson.Gson;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_Lifecycle_Factory;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.MemoizedSentinel;
import dagger.internal.Preconditions;
import dagger.internal.SetBuilder;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerApp_HiltComponents_SingletonC extends App_HiltComponents.SingletonC {
  private final ApplicationContextModule applicationContextModule;

  private final UseCaseModule useCaseModule;

  private final Repository repository;

  private final DataSourceModule dataSourceModule;

  private final DatabaseModule databaseModule;

  private final NetworkModule networkModule;

  private volatile Object mDatabase = new MemoizedSentinel();

  private volatile Object cityDao = new MemoizedSentinel();

  private volatile Object citiesLocalDataSource = new MemoizedSentinel();

  private volatile Object citiesRepository = new MemoizedSentinel();

  private volatile Object citiesUseCase = new MemoizedSentinel();

  private volatile Object foodDao = new MemoizedSentinel();

  private volatile Object foodsLocalDataSource = new MemoizedSentinel();

  private volatile Object okHttpClient = new MemoizedSentinel();

  private volatile Object gson = new MemoizedSentinel();

  private volatile Object retrofit = new MemoizedSentinel();

  private volatile Object foodsAndCitiesApi = new MemoizedSentinel();

  private volatile Object foodsAndCitiesRemoteDataSource = new MemoizedSentinel();

  private volatile Object updateListRepository = new MemoizedSentinel();

  private volatile Object updateListUseCase = new MemoizedSentinel();

  private volatile Object foodsRepository = new MemoizedSentinel();

  private volatile Object foodsUseCase = new MemoizedSentinel();

  private DaggerApp_HiltComponents_SingletonC(
      ApplicationContextModule applicationContextModuleParam,
      DataSourceModule dataSourceModuleParam, DatabaseModule databaseModuleParam,
      NetworkModule networkModuleParam, Repository repositoryParam,
      UseCaseModule useCaseModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
    this.useCaseModule = useCaseModuleParam;
    this.repository = repositoryParam;
    this.dataSourceModule = dataSourceModuleParam;
    this.databaseModule = databaseModuleParam;
    this.networkModule = networkModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  private MDatabase mDatabase() {
    Object local = mDatabase;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = mDatabase;
        if (local instanceof MemoizedSentinel) {
          local = DatabaseModule_ProvideMDatabaseFactory.provideMDatabase(databaseModule, ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
          mDatabase = DoubleCheck.reentrantCheck(mDatabase, local);
        }
      }
    }
    return (MDatabase) local;
  }

  private CityDao cityDao() {
    Object local = cityDao;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = cityDao;
        if (local instanceof MemoizedSentinel) {
          local = DatabaseModule_ProvideCityDaoFactory.provideCityDao(databaseModule, mDatabase());
          cityDao = DoubleCheck.reentrantCheck(cityDao, local);
        }
      }
    }
    return (CityDao) local;
  }

  private CitiesLocalDataSource citiesLocalDataSource() {
    Object local = citiesLocalDataSource;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = citiesLocalDataSource;
        if (local instanceof MemoizedSentinel) {
          local = DataSourceModule_ProvideCityLocalDataSourceFactory.provideCityLocalDataSource(dataSourceModule, cityDao());
          citiesLocalDataSource = DoubleCheck.reentrantCheck(citiesLocalDataSource, local);
        }
      }
    }
    return (CitiesLocalDataSource) local;
  }

  private CitiesRepository citiesRepository() {
    Object local = citiesRepository;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = citiesRepository;
        if (local instanceof MemoizedSentinel) {
          local = Repository_ProvideCitiesRepositoryFactory.provideCitiesRepository(repository, citiesLocalDataSource());
          citiesRepository = DoubleCheck.reentrantCheck(citiesRepository, local);
        }
      }
    }
    return (CitiesRepository) local;
  }

  private CitiesUseCase citiesUseCase() {
    Object local = citiesUseCase;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = citiesUseCase;
        if (local instanceof MemoizedSentinel) {
          local = UseCaseModule_ProvideCitiesUseCaseFactory.provideCitiesUseCase(useCaseModule, citiesRepository());
          citiesUseCase = DoubleCheck.reentrantCheck(citiesUseCase, local);
        }
      }
    }
    return (CitiesUseCase) local;
  }

  private FoodDao foodDao() {
    Object local = foodDao;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = foodDao;
        if (local instanceof MemoizedSentinel) {
          local = DatabaseModule_ProvideFoodDaoFactory.provideFoodDao(databaseModule, mDatabase());
          foodDao = DoubleCheck.reentrantCheck(foodDao, local);
        }
      }
    }
    return (FoodDao) local;
  }

  private FoodsLocalDataSource foodsLocalDataSource() {
    Object local = foodsLocalDataSource;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = foodsLocalDataSource;
        if (local instanceof MemoizedSentinel) {
          local = DataSourceModule_ProvideFoodLocalDataSourceFactory.provideFoodLocalDataSource(dataSourceModule, foodDao());
          foodsLocalDataSource = DoubleCheck.reentrantCheck(foodsLocalDataSource, local);
        }
      }
    }
    return (FoodsLocalDataSource) local;
  }

  private OkHttpClient okHttpClient() {
    Object local = okHttpClient;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = okHttpClient;
        if (local instanceof MemoizedSentinel) {
          local = NetworkModule_ProvideOkHttpClientFactory.provideOkHttpClient(networkModule);
          okHttpClient = DoubleCheck.reentrantCheck(okHttpClient, local);
        }
      }
    }
    return (OkHttpClient) local;
  }

  private Gson gson() {
    Object local = gson;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = gson;
        if (local instanceof MemoizedSentinel) {
          local = NetworkModule_ProvideGsonFactory.provideGson(networkModule);
          gson = DoubleCheck.reentrantCheck(gson, local);
        }
      }
    }
    return (Gson) local;
  }

  private Retrofit retrofit() {
    Object local = retrofit;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = retrofit;
        if (local instanceof MemoizedSentinel) {
          local = NetworkModule_ProvideRetrofitFactory.provideRetrofit(networkModule, okHttpClient(), gson());
          retrofit = DoubleCheck.reentrantCheck(retrofit, local);
        }
      }
    }
    return (Retrofit) local;
  }

  private FoodsAndCitiesApi foodsAndCitiesApi() {
    Object local = foodsAndCitiesApi;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = foodsAndCitiesApi;
        if (local instanceof MemoizedSentinel) {
          local = NetworkModule_ProvideFoodsAndCitiesApiFactory.provideFoodsAndCitiesApi(networkModule, retrofit());
          foodsAndCitiesApi = DoubleCheck.reentrantCheck(foodsAndCitiesApi, local);
        }
      }
    }
    return (FoodsAndCitiesApi) local;
  }

  private FoodsAndCitiesRemoteDataSource foodsAndCitiesRemoteDataSource() {
    Object local = foodsAndCitiesRemoteDataSource;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = foodsAndCitiesRemoteDataSource;
        if (local instanceof MemoizedSentinel) {
          local = DataSourceModule_ProvideSampleRemoteDataSourceFactory.provideSampleRemoteDataSource(dataSourceModule, foodsAndCitiesApi());
          foodsAndCitiesRemoteDataSource = DoubleCheck.reentrantCheck(foodsAndCitiesRemoteDataSource, local);
        }
      }
    }
    return (FoodsAndCitiesRemoteDataSource) local;
  }

  private UpdateListRepository updateListRepository() {
    Object local = updateListRepository;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = updateListRepository;
        if (local instanceof MemoizedSentinel) {
          local = Repository_ProvideSampleRepositoryFactory.provideSampleRepository(repository, citiesLocalDataSource(), foodsLocalDataSource(), foodsAndCitiesRemoteDataSource());
          updateListRepository = DoubleCheck.reentrantCheck(updateListRepository, local);
        }
      }
    }
    return (UpdateListRepository) local;
  }

  private UpdateListUseCase updateListUseCase() {
    Object local = updateListUseCase;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = updateListUseCase;
        if (local instanceof MemoizedSentinel) {
          local = UseCaseModule_ProvideUpdateListUseCaseFactory.provideUpdateListUseCase(useCaseModule, updateListRepository());
          updateListUseCase = DoubleCheck.reentrantCheck(updateListUseCase, local);
        }
      }
    }
    return (UpdateListUseCase) local;
  }

  private FoodsRepository foodsRepository() {
    Object local = foodsRepository;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = foodsRepository;
        if (local instanceof MemoizedSentinel) {
          local = Repository_ProvideFoodsRepositoryFactory.provideFoodsRepository(repository, foodsLocalDataSource());
          foodsRepository = DoubleCheck.reentrantCheck(foodsRepository, local);
        }
      }
    }
    return (FoodsRepository) local;
  }

  private FoodsUseCase foodsUseCase() {
    Object local = foodsUseCase;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = foodsUseCase;
        if (local instanceof MemoizedSentinel) {
          local = UseCaseModule_ProvideFoodsUseCaseFactory.provideFoodsUseCase(useCaseModule, foodsRepository());
          foodsUseCase = DoubleCheck.reentrantCheck(foodsUseCase, local);
        }
      }
    }
    return (FoodsUseCase) local;
  }

  @Override
  public void injectApp(App app) {
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder();
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private DataSourceModule dataSourceModule;

    private DatabaseModule databaseModule;

    private NetworkModule networkModule;

    private Repository repository;

    private UseCaseModule useCaseModule;

    private Builder() {
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder applicationModule(ApplicationModule applicationModule) {
      Preconditions.checkNotNull(applicationModule);
      return this;
    }

    public Builder dataSourceModule(DataSourceModule dataSourceModule) {
      this.dataSourceModule = Preconditions.checkNotNull(dataSourceModule);
      return this;
    }

    public Builder databaseModule(DatabaseModule databaseModule) {
      this.databaseModule = Preconditions.checkNotNull(databaseModule);
      return this;
    }

    public Builder networkModule(NetworkModule networkModule) {
      this.networkModule = Preconditions.checkNotNull(networkModule);
      return this;
    }

    public Builder repository(Repository repository) {
      this.repository = Preconditions.checkNotNull(repository);
      return this;
    }

    public Builder useCaseModule(UseCaseModule useCaseModule) {
      this.useCaseModule = Preconditions.checkNotNull(useCaseModule);
      return this;
    }

    public App_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      if (dataSourceModule == null) {
        this.dataSourceModule = new DataSourceModule();
      }
      if (databaseModule == null) {
        this.databaseModule = new DatabaseModule();
      }
      if (networkModule == null) {
        this.networkModule = new NetworkModule();
      }
      if (repository == null) {
        this.repository = new Repository();
      }
      if (useCaseModule == null) {
        this.useCaseModule = new UseCaseModule();
      }
      return new DaggerApp_HiltComponents_SingletonC(applicationContextModule, dataSourceModule, databaseModule, networkModule, repository, useCaseModule);
    }
  }

  private final class ActivityRetainedCBuilder implements App_HiltComponents.ActivityRetainedC.Builder {
    @Override
    public App_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl();
    }
  }

  private final class ActivityRetainedCImpl extends App_HiltComponents.ActivityRetainedC {
    private volatile Object lifecycle = new MemoizedSentinel();

    private ActivityRetainedCImpl() {

    }

    private Object lifecycle() {
      Object local = lifecycle;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = lifecycle;
          if (local instanceof MemoizedSentinel) {
            local = ActivityRetainedComponentManager_Lifecycle_Factory.newInstance();
            lifecycle = DoubleCheck.reentrantCheck(lifecycle, local);
          }
        }
      }
      return (Object) local;
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder();
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return (ActivityRetainedLifecycle) lifecycle();
    }

    private final class ActivityCBuilder implements App_HiltComponents.ActivityC.Builder {
      private Activity activity;

      @Override
      public ActivityCBuilder activity(Activity activity) {
        this.activity = Preconditions.checkNotNull(activity);
        return this;
      }

      @Override
      public App_HiltComponents.ActivityC build() {
        Preconditions.checkBuilderRequirement(activity, Activity.class);
        return new ActivityCImpl(activity);
      }
    }

    private final class ActivityCImpl extends App_HiltComponents.ActivityC {
      private ActivityCImpl(Activity activity) {

      }

      @Override
      public void injectMainActivity(MainActivity mainActivity) {
      }

      @Override
      public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
        return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerApp_HiltComponents_SingletonC.this.applicationContextModule), getViewModelKeys(), new ViewModelCBuilder());
      }

      @Override
      public Set<String> getViewModelKeys() {
        return SetBuilder.<String>newSetBuilder(2).add(CityDetailsViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(HomeViewModel_HiltModules_KeyModule_ProvideFactory.provide()).build();
      }

      @Override
      public ViewModelComponentBuilder getViewModelComponentBuilder() {
        return new ViewModelCBuilder();
      }

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder();
      }

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder();
      }

      private final class FragmentCBuilder implements App_HiltComponents.FragmentC.Builder {
        private Fragment fragment;

        @Override
        public FragmentCBuilder fragment(Fragment fragment) {
          this.fragment = Preconditions.checkNotNull(fragment);
          return this;
        }

        @Override
        public App_HiltComponents.FragmentC build() {
          Preconditions.checkBuilderRequirement(fragment, Fragment.class);
          return new FragmentCI(fragment);
        }
      }

      private final class FragmentCI extends App_HiltComponents.FragmentC {
        private FragmentCI(Fragment fragment) {

        }

        @Override
        public void injectCityDetailsFragment(CityDetailsFragment cityDetailsFragment) {
        }

        @Override
        public void injectHomeFragment(HomeFragment homeFragment) {
        }

        @Override
        public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
          return ActivityCImpl.this.getHiltInternalFactoryFactory();
        }

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder();
        }

        private final class ViewWithFragmentCBuilder implements App_HiltComponents.ViewWithFragmentC.Builder {
          private View view;

          @Override
          public ViewWithFragmentCBuilder view(View view) {
            this.view = Preconditions.checkNotNull(view);
            return this;
          }

          @Override
          public App_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(view, View.class);
            return new ViewWithFragmentCI(view);
          }
        }

        private final class ViewWithFragmentCI extends App_HiltComponents.ViewWithFragmentC {
          private ViewWithFragmentCI(View view) {

          }
        }
      }

      private final class ViewCBuilder implements App_HiltComponents.ViewC.Builder {
        private View view;

        @Override
        public ViewCBuilder view(View view) {
          this.view = Preconditions.checkNotNull(view);
          return this;
        }

        @Override
        public App_HiltComponents.ViewC build() {
          Preconditions.checkBuilderRequirement(view, View.class);
          return new ViewCI(view);
        }
      }

      private final class ViewCI extends App_HiltComponents.ViewC {
        private ViewCI(View view) {

        }
      }
    }

    private final class ViewModelCBuilder implements App_HiltComponents.ViewModelC.Builder {
      private SavedStateHandle savedStateHandle;

      @Override
      public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
        this.savedStateHandle = Preconditions.checkNotNull(handle);
        return this;
      }

      @Override
      public App_HiltComponents.ViewModelC build() {
        Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
        return new ViewModelCImpl(savedStateHandle);
      }
    }

    private final class ViewModelCImpl extends App_HiltComponents.ViewModelC {
      private volatile Provider<CityDetailsViewModel> cityDetailsViewModelProvider;

      private volatile Provider<HomeViewModel> homeViewModelProvider;

      private ViewModelCImpl(SavedStateHandle savedStateHandle) {

      }

      private CityDetailsViewModel cityDetailsViewModel() {
        return new CityDetailsViewModel(DaggerApp_HiltComponents_SingletonC.this.citiesUseCase());
      }

      private Provider<CityDetailsViewModel> cityDetailsViewModelProvider() {
        Object local = cityDetailsViewModelProvider;
        if (local == null) {
          local = new SwitchingProvider<>(0);
          cityDetailsViewModelProvider = (Provider<CityDetailsViewModel>) local;
        }
        return (Provider<CityDetailsViewModel>) local;
      }

      private HomeViewModel homeViewModel() {
        return new HomeViewModel(DaggerApp_HiltComponents_SingletonC.this.updateListUseCase(), DaggerApp_HiltComponents_SingletonC.this.citiesUseCase(), DaggerApp_HiltComponents_SingletonC.this.foodsUseCase());
      }

      private Provider<HomeViewModel> homeViewModelProvider() {
        Object local = homeViewModelProvider;
        if (local == null) {
          local = new SwitchingProvider<>(1);
          homeViewModelProvider = (Provider<HomeViewModel>) local;
        }
        return (Provider<HomeViewModel>) local;
      }

      @Override
      public Map<String, Provider<ViewModel>> getHiltViewModelMap() {
        return MapBuilder.<String, Provider<ViewModel>>newMapBuilder(2).put("com.example.template.ui.city.CityDetailsViewModel", (Provider) cityDetailsViewModelProvider()).put("com.example.template.ui.home.HomeViewModel", (Provider) homeViewModelProvider()).build();
      }

      private final class SwitchingProvider<T> implements Provider<T> {
        private final int id;

        SwitchingProvider(int id) {
          this.id = id;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T get() {
          switch (id) {
            case 0: // com.example.template.ui.city.CityDetailsViewModel 
            return (T) ViewModelCImpl.this.cityDetailsViewModel();

            case 1: // com.example.template.ui.home.HomeViewModel 
            return (T) ViewModelCImpl.this.homeViewModel();

            default: throw new AssertionError(id);
          }
        }
      }
    }
  }

  private final class ServiceCBuilder implements App_HiltComponents.ServiceC.Builder {
    private Service service;

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public App_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(service);
    }
  }

  private final class ServiceCImpl extends App_HiltComponents.ServiceC {
    private ServiceCImpl(Service service) {

    }
  }
}

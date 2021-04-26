package com.example.template.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007\u00a8\u0006\u0013"}, d2 = {"Lcom/example/template/di/ApplicationModule;", "", "()V", "provideBaseActivity", "Lcom/example/template/base/BaseActivity;", "activity", "Landroid/app/Activity;", "provideBaseFragment", "Lcom/example/template/base/BaseFragment;", "fragment", "Landroidx/fragment/app/Fragment;", "provideBaseViewModel", "Lcom/example/template/base/BaseViewModel;", "viewModel", "Landroidx/lifecycle/ViewModel;", "provideContext", "Landroid/content/Context;", "application", "Lcom/example/template/App;", "app_debug"})
@dagger.Module()
public final class ApplicationModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.template.base.BaseActivity provideBaseActivity(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.template.base.BaseFragment provideBaseFragment(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.template.base.BaseViewModel provideBaseViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModel viewModel) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final android.content.Context provideContext(@org.jetbrains.annotations.NotNull()
    com.example.template.App application) {
        return null;
    }
    
    public ApplicationModule() {
        super();
    }
}
package com.example.template.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u001b\u001c\u001d\u001eB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ&\u0010\u000b\u001a\u00020\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000eJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0018\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0013H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/example/template/ui/home/FoodAndCityAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/template/ui/home/DataItem;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "cityClickListener", "Lcom/example/template/ui/home/CityListener;", "foodClickListener", "Lcom/example/template/ui/home/FoodListener;", "(Lcom/example/template/ui/home/CityListener;Lcom/example/template/ui/home/FoodListener;)V", "adapterScope", "Lkotlinx/coroutines/CoroutineScope;", "addHeaderAndSubmitList", "", "cityList", "", "Lcom/example/template/domain/entity/popular/CityEntity;", "foodList", "Lcom/example/template/domain/entity/popular/FoodEntity;", "getItemViewType", "", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "CityHeaderViewHolder", "CityViewHolder", "FoodHeaderViewHolder", "FoodViewHolder", "app_debug"})
public final class FoodAndCityAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.template.ui.home.DataItem, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private final kotlinx.coroutines.CoroutineScope adapterScope = null;
    private final com.example.template.ui.home.CityListener cityClickListener = null;
    private final com.example.template.ui.home.FoodListener foodClickListener = null;
    
    public final void addHeaderAndSubmitList(@org.jetbrains.annotations.Nullable()
    java.util.List<com.example.template.domain.entity.popular.CityEntity> cityList, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.template.domain.entity.popular.FoodEntity> foodList) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    public FoodAndCityAdapter(@org.jetbrains.annotations.NotNull()
    com.example.template.ui.home.CityListener cityClickListener, @org.jetbrains.annotations.NotNull()
    com.example.template.ui.home.FoodListener foodClickListener) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0006"}, d2 = {"Lcom/example/template/ui/home/FoodAndCityAdapter$CityHeaderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "Companion", "app_debug"})
    public static final class CityHeaderViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.template.ui.home.FoodAndCityAdapter.CityHeaderViewHolder.Companion Companion = null;
        
        public CityHeaderViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/template/ui/home/FoodAndCityAdapter$CityHeaderViewHolder$Companion;", "", "()V", "from", "Lcom/example/template/ui/home/FoodAndCityAdapter$CityHeaderViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.template.ui.home.FoodAndCityAdapter.CityHeaderViewHolder from(@org.jetbrains.annotations.NotNull()
            android.view.ViewGroup parent) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0006"}, d2 = {"Lcom/example/template/ui/home/FoodAndCityAdapter$FoodHeaderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "Companion", "app_debug"})
    public static final class FoodHeaderViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.template.ui.home.FoodAndCityAdapter.FoodHeaderViewHolder.Companion Companion = null;
        
        public FoodHeaderViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/template/ui/home/FoodAndCityAdapter$FoodHeaderViewHolder$Companion;", "", "()V", "from", "Lcom/example/template/ui/home/FoodAndCityAdapter$FoodHeaderViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.template.ui.home.FoodAndCityAdapter.FoodHeaderViewHolder from(@org.jetbrains.annotations.NotNull()
            android.view.ViewGroup parent) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000e"}, d2 = {"Lcom/example/template/ui/home/FoodAndCityAdapter$CityViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/template/databinding/ItemListCityBinding;", "(Lcom/example/template/databinding/ItemListCityBinding;)V", "getBinding", "()Lcom/example/template/databinding/ItemListCityBinding;", "bind", "", "item", "Lcom/example/template/domain/entity/popular/CityEntity;", "clickListener", "Lcom/example/template/ui/home/CityListener;", "Companion", "app_debug"})
    public static final class CityViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.example.template.databinding.ItemListCityBinding binding = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.example.template.ui.home.FoodAndCityAdapter.CityViewHolder.Companion Companion = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.template.domain.entity.popular.CityEntity item, @org.jetbrains.annotations.NotNull()
        com.example.template.ui.home.CityListener clickListener) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.template.databinding.ItemListCityBinding getBinding() {
            return null;
        }
        
        private CityViewHolder(com.example.template.databinding.ItemListCityBinding binding) {
            super(null);
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/template/ui/home/FoodAndCityAdapter$CityViewHolder$Companion;", "", "()V", "from", "Lcom/example/template/ui/home/FoodAndCityAdapter$CityViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.template.ui.home.FoodAndCityAdapter.CityViewHolder from(@org.jetbrains.annotations.NotNull()
            android.view.ViewGroup parent) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000e"}, d2 = {"Lcom/example/template/ui/home/FoodAndCityAdapter$FoodViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/template/databinding/ItemListFoodBinding;", "(Lcom/example/template/databinding/ItemListFoodBinding;)V", "getBinding", "()Lcom/example/template/databinding/ItemListFoodBinding;", "bind", "", "item", "Lcom/example/template/domain/entity/popular/FoodEntity;", "clickListener", "Lcom/example/template/ui/home/FoodListener;", "Companion", "app_debug"})
    public static final class FoodViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.example.template.databinding.ItemListFoodBinding binding = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.example.template.ui.home.FoodAndCityAdapter.FoodViewHolder.Companion Companion = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.template.domain.entity.popular.FoodEntity item, @org.jetbrains.annotations.NotNull()
        com.example.template.ui.home.FoodListener clickListener) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.template.databinding.ItemListFoodBinding getBinding() {
            return null;
        }
        
        private FoodViewHolder(com.example.template.databinding.ItemListFoodBinding binding) {
            super(null);
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/template/ui/home/FoodAndCityAdapter$FoodViewHolder$Companion;", "", "()V", "from", "Lcom/example/template/ui/home/FoodAndCityAdapter$FoodViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.template.ui.home.FoodAndCityAdapter.FoodViewHolder from(@org.jetbrains.annotations.NotNull()
            android.view.ViewGroup parent) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
}
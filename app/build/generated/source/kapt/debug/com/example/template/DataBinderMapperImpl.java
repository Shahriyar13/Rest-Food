package com.example.template;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.template.databinding.FragmentCityDetailsBindingImpl;
import com.example.template.databinding.FragmentHomeBindingImpl;
import com.example.template.databinding.ItemListCityBindingImpl;
import com.example.template.databinding.ItemListFoodBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTCITYDETAILS = 1;

  private static final int LAYOUT_FRAGMENTHOME = 2;

  private static final int LAYOUT_ITEMLISTCITY = 3;

  private static final int LAYOUT_ITEMLISTFOOD = 4;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(4);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.template.R.layout.fragment_city_details, LAYOUT_FRAGMENTCITYDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.template.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.template.R.layout.item_list_city, LAYOUT_ITEMLISTCITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.template.R.layout.item_list_food, LAYOUT_ITEMLISTFOOD);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTCITYDETAILS: {
          if ("layout/fragment_city_details_0".equals(tag)) {
            return new FragmentCityDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_city_details is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMLISTCITY: {
          if ("layout/item_list_city_0".equals(tag)) {
            return new ItemListCityBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_list_city is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMLISTFOOD: {
          if ("layout/item_list_food_0".equals(tag)) {
            return new ItemListFoodBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_list_food is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(6);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "city");
      sKeys.put(2, "clickListener");
      sKeys.put(3, "food");
      sKeys.put(4, "viewModel");
      sKeys.put(5, "vm");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(4);

    static {
      sKeys.put("layout/fragment_city_details_0", com.example.template.R.layout.fragment_city_details);
      sKeys.put("layout/fragment_home_0", com.example.template.R.layout.fragment_home);
      sKeys.put("layout/item_list_city_0", com.example.template.R.layout.item_list_city);
      sKeys.put("layout/item_list_food_0", com.example.template.R.layout.item_list_food);
    }
  }
}

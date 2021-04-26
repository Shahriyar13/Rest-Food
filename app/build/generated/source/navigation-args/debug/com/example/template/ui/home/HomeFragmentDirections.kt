package com.example.template.ui.home

import android.os.Bundle
import androidx.navigation.NavDirections
import com.example.template.R
import kotlin.Int
import kotlin.Long

public class HomeFragmentDirections private constructor() {
  private data class ActionFragmentHomeToFragmentFeatureA(
    public val id: Long = 0L
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_fragmentHome_to_fragmentFeatureA

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putLong("id", this.id)
      return result
    }
  }

  public companion object {
    public fun actionFragmentHomeToFragmentFeatureA(id: Long = 0L): NavDirections =
        ActionFragmentHomeToFragmentFeatureA(id)
  }
}

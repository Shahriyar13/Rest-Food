package com.example.template.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.FragmentNavigator
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import androidx.transition.TransitionInflater
import com.example.template.base.BaseFragment
import com.example.template.common.extensions.attachToolbarToNavigation
import com.example.template.common.extensions.safeNavigate
import com.example.template.databinding.FragmentHomeBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : BaseFragment() {

    private lateinit var binding: FragmentHomeBinding

    private lateinit var foodAndCityAdapter: FoodAndCityAdapter

    private val viewModel: HomeViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sharedElementEnterTransition = TransitionInflater.from(context).inflateTransition(android.R.transition.move)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentHomeBinding.inflate(inflater, container, false).apply {
            vm = viewModel
            lifecycleOwner = viewLifecycleOwner
        }

        binding.swipeRefresh.isRefreshing = true

        attachToolbarToNavigation(binding.toolbarLayout.toolbar)

        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        foodAndCityAdapter = FoodAndCityAdapter(
                CityListener { cityId, extras -> navigateToCityDetails(cityId, extras) },
                FoodListener { foodId -> }
        )

        binding.recyclerViewFoodAndCity.apply {
            adapter = foodAndCityAdapter
            postponeEnterTransition()
            viewTreeObserver.addOnPreDrawListener {
                startPostponedEnterTransition()
                true
            }
        }

        binding.swipeRefresh.setOnRefreshListener {
            viewModel.refreshRequested()
        }

        viewModel.list.observe(viewLifecycleOwner) {
            binding.swipeRefresh.isRefreshing = false
            foodAndCityAdapter.addHeaderAndSubmitList(it.cities, it.foods)
        }

    }

    private fun navigateToCityDetails(it: Long?, extras: FragmentNavigator.Extras) {
        val direction = HomeFragmentDirections.actionFragmentHomeToFragmentCityDetails(
                it!!,
        )
        findNavController().safeNavigate(direction, extras)
    }
}
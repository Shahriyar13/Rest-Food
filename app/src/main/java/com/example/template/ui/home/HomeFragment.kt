package com.example.template.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.template.base.BaseFragment
import com.example.template.common.extensions.safeNavigate
import com.example.template.databinding.FragmentHomeBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : BaseFragment() {

    private lateinit var binding: FragmentHomeBinding

    private lateinit var adapter: FoodAndCityAdapter

    private val viewModel: HomeViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentHomeBinding.inflate(inflater, container, false).apply {
            vm = viewModel
            lifecycleOwner = viewLifecycleOwner
        }

        adapter = FoodAndCityAdapter(
            CityListener { cityId -> viewModel.onCityClicked(cityId) },
            FoodListener { foodId -> viewModel.onFoodClicked(foodId) }
        )

        binding.recyclerViewFoodAndCity.adapter = adapter

        binding.swipeRefresh.isRefreshing = true

        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.swipeRefresh.setOnRefreshListener {
            viewModel.refreshRequested()
        }

        viewModel.navigateToCityDetails.observe(viewLifecycleOwner) {
            val direction = HomeFragmentDirections.actionFragmentHomeToFragmentFeatureA(
                it!!
            )
            findNavController().safeNavigate(direction)
        }

        viewModel.navigateToFoodDetails.observe(viewLifecycleOwner) {
            val direction = HomeFragmentDirections.actionFragmentHomeToFragmentFeatureA(
                it!!
            )
            findNavController().safeNavigate(direction)
        }

        viewModel.list.observe(viewLifecycleOwner) {
            binding.swipeRefresh.isRefreshing = false
            adapter.addHeaderAndSubmitList(it.cities, it.foods)
        }

    }
}
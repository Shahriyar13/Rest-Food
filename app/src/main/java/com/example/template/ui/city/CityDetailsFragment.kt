package com.example.template.ui.city

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.example.template.base.BaseFragment
import com.example.template.common.extensions.load
import com.example.template.databinding.FragmentCityDetailsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CityDetailsFragment: BaseFragment() {

    private lateinit var binding: FragmentCityDetailsBinding
    private val args: CityDetailsFragmentArgs by navArgs()
    private val viewModel: CityDetailsViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentCityDetailsBinding.inflate(inflater, container, false).apply {
            viewModel = this.viewModel
            lifecycleOwner = viewLifecycleOwner
        }

        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.city.observe(viewLifecycleOwner) {
            binding.imageViewCity.load(it.imageUrl)
        }

        viewModel.setCityId(args.id)
//        viewModel.sampleValue.value = args.sampleText
//        binding.editTextSampleTitle.setText(args.sampleText)

    }
}
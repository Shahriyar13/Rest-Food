package com.example.template.ui.city

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.ViewCompat
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import androidx.transition.TransitionInflater
import com.example.template.base.BaseFragment
import com.example.template.common.extensions.load
import com.example.template.databinding.FragmentCityDetailsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CityDetailsFragment: BaseFragment() {

    private lateinit var binding: FragmentCityDetailsBinding
    private val args: CityDetailsFragmentArgs by navArgs()
    private val viewModel: CityDetailsViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sharedElementEnterTransition = TransitionInflater.from(context).inflateTransition(android.R.transition.move)
    }

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

        ViewCompat.setTransitionName(binding.imageViewCity, "image_${args.id}")
        ViewCompat.setTransitionName(binding.textViewTitle, "title_${args.id}")
        ViewCompat.setTransitionName(binding.textViewDescription, "description_${args.id}")

        viewModel.city.observe(viewLifecycleOwner) {
            binding.imageViewCity.load(it.imageUrl)
            binding.textViewTitle.text = it.name
            binding.textViewDescription.text = it.description
        }

        viewModel.setCityId(args.id)

        super.onViewCreated(view, savedInstanceState)

    }
}
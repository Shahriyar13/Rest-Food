package com.example.template.ui.home

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.ViewCompat
import androidx.navigation.fragment.FragmentNavigator
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.template.R
import com.example.template.common.extensions.load
import com.example.template.databinding.ItemListCityBinding
import com.example.template.databinding.ItemListFoodBinding
import com.example.template.domain.entity.popular.CityEntity
import com.example.template.domain.entity.popular.FoodEntity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

private const val ITEM_VIEW_TYPE_CITY_HEADER = 0
private const val ITEM_VIEW_TYPE_FOOD_HEADER = 1
private const val ITEM_VIEW_TYPE_CITY = 2
private const val ITEM_VIEW_TYPE_FOOD = 3

class FoodAndCityAdapter(
    private val cityClickListener: CityListener,
    private val foodClickListener: FoodListener
) : ListAdapter<DataItem, RecyclerView.ViewHolder>(DiffCallback()) {

    private val adapterScope = CoroutineScope(Dispatchers.Default)

    fun addHeaderAndSubmitList(cityList: List<CityEntity>?, foodList: List<FoodEntity>?) {
        adapterScope.launch {
            val cityItems = when (cityList) {
                null -> listOf(DataItem.CityHeader)
                else -> listOf(DataItem.CityHeader) + cityList.map { DataItem.CityItem(it) }
            }
            val foodItems = when (foodList) {
                null -> listOf(DataItem.FoodHeader)
                else -> listOf(DataItem.FoodHeader) + foodList.map { DataItem.FoodItem(it) }
            }
            val list = cityItems + foodItems
            withContext(Dispatchers.Main) {
                submitList(list)
            }
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is CityViewHolder -> {
                val item = getItem(position) as DataItem.CityItem
                holder.bind(item.city, cityClickListener)
            }
            is FoodViewHolder -> {
                val item = getItem(position) as DataItem.FoodItem
                holder.bind(item.food, foodClickListener)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            ITEM_VIEW_TYPE_CITY_HEADER -> CityHeaderViewHolder.from(parent)
            ITEM_VIEW_TYPE_FOOD_HEADER -> FoodHeaderViewHolder.from(parent)
            ITEM_VIEW_TYPE_CITY -> CityViewHolder.from(parent)
            ITEM_VIEW_TYPE_FOOD -> FoodViewHolder.from(parent)
            else -> throw ClassCastException("Unknown viewType $viewType")
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when (getItem(position)) {
            is DataItem.CityHeader -> ITEM_VIEW_TYPE_CITY_HEADER
            is DataItem.FoodHeader -> ITEM_VIEW_TYPE_FOOD_HEADER
            is DataItem.CityItem -> ITEM_VIEW_TYPE_CITY
            is DataItem.FoodItem -> ITEM_VIEW_TYPE_FOOD
        }
    }

    class CityHeaderViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        companion object {
            fun from(parent: ViewGroup): CityHeaderViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val view = layoutInflater.inflate(R.layout.item_header_city, parent, false)
                return CityHeaderViewHolder(view)
            }
        }
    }

    class FoodHeaderViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        companion object {
            fun from(parent: ViewGroup): FoodHeaderViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val view = layoutInflater.inflate(R.layout.item_header_food, parent, false)
                return FoodHeaderViewHolder(view)
            }
        }
    }

    class CityViewHolder private constructor(private val binding: ItemListCityBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: CityEntity, clickListener: CityListener) {

            ViewCompat.setTransitionName(binding.imageView, "image_${item.id}")
            ViewCompat.setTransitionName(binding.textViewTitle, "title_${item.id}")
            ViewCompat.setTransitionName(binding.textViewDescription, "description_${item.id}")

            with(binding) {
                city = item
                executePendingBindings()
                imageView.load(item.imageUrl)
            }

            binding.cardView.setOnClickListener {
                 val extras = FragmentNavigatorExtras(
                        binding.imageView to "image_${item.id}",
                        binding.textViewTitle to "title_${item.id}",
                        binding.textViewDescription to "description_${item.id}")

                clickListener.onClick(item, extras)
            }
        }

        companion object {
            fun from(parent: ViewGroup): CityViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ItemListCityBinding.inflate(layoutInflater, parent, false)
                return CityViewHolder(binding)
            }
        }
    }

    class FoodViewHolder private constructor(private val binding: ItemListFoodBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: FoodEntity, clickListener: FoodListener) {
            binding.food = item
            binding.image.load(item.imageUrl)
            binding.clickListener = clickListener
            binding.executePendingBindings()
        }

        companion object {
            fun from(parent: ViewGroup): FoodViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ItemListFoodBinding.inflate(layoutInflater, parent, false)
                return FoodViewHolder(binding)
            }
        }
    }
}

class DiffCallback : DiffUtil.ItemCallback<DataItem>() {
    override fun areItemsTheSame(oldItem: DataItem, newItem: DataItem): Boolean {
        return oldItem.id == newItem.id
    }

    @SuppressLint("DiffUtilEquals")
    override fun areContentsTheSame(oldItem: DataItem, newItem: DataItem): Boolean {
        return oldItem == newItem
    }
}

class CityListener(val clickListener: (cityId: Long, extras: FragmentNavigator.Extras) -> Unit) {
    fun onClick(city: CityEntity, extras: FragmentNavigator.Extras) = clickListener(city.id!!, extras)
}

class FoodListener(val clickListener: (foodId: Long) -> Unit) {
    fun onClick(food: FoodEntity) = clickListener(food.id!!)
}

sealed class DataItem {
    data class CityItem(val city: CityEntity): DataItem() {
        override val id = city.id!!
    }

    data class FoodItem(val food: FoodEntity): DataItem() {
        override val id = food.id!!
    }

    object CityHeader: DataItem() {
        override val id = Long.MIN_VALUE
    }

    object FoodHeader: DataItem() {
        override val id = Long.MIN_VALUE + 1
    }

    abstract val id: Long
}
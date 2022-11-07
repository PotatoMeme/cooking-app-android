package com.collegecapstoneteam1.cookingapp.util

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.collegecapstoneteam1.cookingapp.ui.view.DetailFragment
import com.collegecapstoneteam1.cookingapp.ui.view.FavoriteFragment
import com.collegecapstoneteam1.cookingapp.ui.view.HomeFragment
import com.collegecapstoneteam1.cookingapp.ui.view.SearchFragment
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

fun <T> SearchFragment.collectLatestStateFlow(flow: Flow<T>, collect: suspend (T) -> Unit){
    viewLifecycleOwner.lifecycleScope.launch {
        viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED){
            flow.collectLatest(collect)
        }
    }
}

fun <T> FavoriteFragment.collectLatestStateFlow(flow: Flow<T>, collect: suspend (T) -> Unit){
    viewLifecycleOwner.lifecycleScope.launch {
        viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED){
            flow.collectLatest(collect)
        }
    }
}
fun <T> HomeFragment.collectLatestStateFlow(flow: Flow<T>, collect: suspend (T) -> Unit){
    viewLifecycleOwner.lifecycleScope.launch {
        viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED){
            flow.collectLatest(collect)
        }
    }
}

fun <T> DetailFragment.collectLatestStateFlow(flow: Flow<T>, collect: suspend (T) -> Unit){
    viewLifecycleOwner.lifecycleScope.launch {
        viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED){
            flow.collectLatest(collect)
        }
    }
}
package com.collegecapstoneteam1.cookingapp.ui.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.collegecapstoneteam1.cookingapp.data.model.Recipe
import com.collegecapstoneteam1.cookingapp.data.model.SearchResponse
import com.collegecapstoneteam1.cookingapp.data.repository.RecipeRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import kotlin.math.sqrt

class MainViewModel(
    private val recipeRepository: RecipeRepository
) : ViewModel() {
    private val _searchResult = MutableLiveData<SearchResponse>()
    val searchResult: LiveData<SearchResponse> get() = _searchResult
    private var startNum = 1


    fun addNum() {
        startNum += 5
    }

    fun decreaseNum() {
        if (startNum != 1) startNum -= 5
    }

    fun searchRecipes(
        startIdx: Int,
        endIdx: Int,
        recipeName: String,
        recipeDetail: String
    ) = viewModelScope.launch(Dispatchers.IO) {
        val response =
            recipeRepository.searchRecipes(startIdx, endIdx, recipeName, recipeDetail)
        if (response.isSuccessful) {
            response.body()?.let { body ->
                _searchResult.postValue(body)
            }
        } else {
            Log.d(TAG, "searchBooks: response.isNotSuccessful")
            Log.d(TAG, response.message())
        }
    }

    fun searchRecipesList(
    ) = viewModelScope.launch(Dispatchers.IO) {
        val response = recipeRepository.searchRecipesList(startNum, startNum + 4)
        if (response.isSuccessful) {
            response.body()?.let { body ->
                _searchResult.postValue(body)
            }
        } else {
            Log.d(TAG, "searchBooks: response.isNotSuccessful")
            Log.d(TAG, response.message())
        }
    }

    private val _serchPagingResult = MutableStateFlow<PagingData<Recipe>>(PagingData.empty())
    val searchPagingResult: StateFlow<PagingData<Recipe>> = _serchPagingResult.asStateFlow()

    fun searchCookingsPaging(RCP_SEQ: Int) {
        viewModelScope.launch {
            recipeRepository.searchcookingPaging(RCP_SEQ)
                .cachedIn(viewModelScope)
                .collect {
                    _serchPagingResult.value = it
                }
        }
    }

    // Room
    fun saveRecipe(recipe: Recipe) = viewModelScope.launch(Dispatchers.IO) {
        recipeRepository.insertRecipe(recipe)
    }

    fun deleteRecipe(recipe: Recipe) = viewModelScope.launch(Dispatchers.IO) {
        recipeRepository.deleteRecipe(recipe)
    }

    val favoriteRecipes: StateFlow<List<Recipe>> = recipeRepository.getFavoriteRecipes()
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), listOf())

    val favoriteeRecipesLiveData: LiveData<List<Recipe>> = recipeRepository.getRecipesToList()




    companion object {
        private const val TAG = "MainViewModel"
    }

}
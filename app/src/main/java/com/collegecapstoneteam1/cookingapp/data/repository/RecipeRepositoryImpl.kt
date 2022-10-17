package com.collegecapstoneteam1.cookingapp.data.repository

import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import androidx.lifecycle.LiveData
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.collegecapstoneteam1.cookingapp.data.api.RetrofitInstance
import com.collegecapstoneteam1.cookingapp.data.db.RecipeDatabase
import com.collegecapstoneteam1.cookingapp.data.model.Recipe
import com.collegecapstoneteam1.cookingapp.data.model.SearchResponse
import com.collegecapstoneteam1.cookingapp.ui.paging.RecipePagingSource
import com.collegecapstoneteam1.cookingapp.util.Constants.PAGING_SIZE
import kotlinx.coroutines.flow.Flow
import retrofit2.Response

class RecipeRepositoryImpl(
    private val db: RecipeDatabase
) : RecipeRepository {
    override suspend fun searchRecipesList(startIdx: Int, endIdx: Int): Response<SearchResponse> {
        return RetrofitInstance.api.searchRecipesList(startIdx, endIdx)
    }

    override suspend fun searchRecipes(
        startIdx: Int,
        endIdx: Int,
        recipeName: String,
        recipeDetail: String
    ): Response<SearchResponse> {
        return RetrofitInstance.api.searchRecipes(startIdx, endIdx, recipeName, recipeDetail)
    }
    override fun searchcookingPaging(RCP_SEQ: Int): Flow<PagingData<Recipe>> {
        val pagingSourceFactory = { RecipePagingSource(RCP_SEQ) }


        return Pager(
            config = PagingConfig(
                pageSize = PAGING_SIZE,
                maxSize = PAGING_SIZE * 3
            ),
            pagingSourceFactory = pagingSourceFactory
        ).flow
    }

    override suspend fun insertRecipe(recipe: Recipe) {
        db.recipeDao().insertRecipe(recipe)
    }

    override suspend fun deleteRecipe(recipe: Recipe) {
        db.recipeDao().deleteRecipe(recipe)
    }

    override fun getFavoriteRecipes(): Flow<List<Recipe>> {
        return db.recipeDao().getFavoriteRecipes()
    }

    override fun getRecipesToList(): LiveData<List<Recipe>> {
        return db.recipeDao().getRecipes()
    }
}
package com.collegecapstoneteam1.cookingapp.data.api

import com.collegecapstoneteam1.cookingapp.data.model.SearchResponse
import com.collegecapstoneteam1.cookingapp.util.Constants.API_KEY
import com.example.myapplication.test.ServerResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface RecipeSearchApi {
    @GET("/api/{API_KEY}/COOKRCP01/json/{startIdx}/{endIdx}")
    suspend fun searchRecipesList(
        @Path("startIdx") startIdx: Int,
        @Path("endIdx") endIdx: Int,
        @Path("API_KEY") api_key : String = API_KEY,
    ): Response<SearchResponse>

    @GET("/api/{API_KEY}/COOKRCP01/json/{startIdx}/{endIdx}/RCP_NM={RCP_NM}")
    suspend fun searchRecipes(
        @Path("startIdx") startIdx: Int,
        @Path("endIdx") endIdx: Int,
        @Path("RCP_NM") recipeName: String,
        @Path("API_KEY") api_key : String = API_KEY,
    ): Response<SearchResponse>
}
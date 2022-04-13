package kz.muragul.multiplatform.data.api

import kotlinx.coroutines.Deferred
import kz.muragul.multiplatform.domain.model.CategoryResponse
import kz.muragul.multiplatform.domain.model.MealResponse
import kz.muragul.multiplatform.domain.model.RecipeResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("categories.php")
    suspend fun getCategories(): Response<CategoryResponse>

    @GET("filter.php")
    fun getPostListByCategoryAsync(
        @Query("c") strCategory: String
    ): Deferred<Response<RecipeResponse>>

    @GET("lookup.php")
    fun getRecipeAsync(
        @Query("i") idMeal: String
    ): Deferred<Response<MealResponse>>

    @GET("random.php")
    fun getRandomRecipeAsync(): Deferred<Response<MealResponse>>

    @GET("filter.php")
    fun searchForRecipeAsync(@Query("i") ingredient: String): Deferred<Response<RecipeResponse>>
}
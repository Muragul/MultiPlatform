package kz.muragul.multiplatform.domain.repository

import kz.muragul.multiplatform.domain.model.CategoryResponse
import retrofit2.Response

interface CategoriesRepository {
    suspend fun loadData(): Response<CategoryResponse>
}
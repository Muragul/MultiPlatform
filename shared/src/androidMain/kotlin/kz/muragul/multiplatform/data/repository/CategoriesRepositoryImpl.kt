package kz.muragul.multiplatform.data.repository

import kz.muragul.multiplatform.data.api.ApiClient
import kz.muragul.multiplatform.domain.model.CategoryResponse
import kz.muragul.multiplatform.domain.repository.CategoriesRepository
import retrofit2.Response

class CategoriesRepositoryImpl : CategoriesRepository {

    override suspend fun loadData(): Response<CategoryResponse> {
        return ApiClient.getApiService().getCategories()
    }

}
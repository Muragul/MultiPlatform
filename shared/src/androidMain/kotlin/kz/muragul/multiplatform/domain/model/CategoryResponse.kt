package kz.muragul.multiplatform.domain.model

import com.google.gson.annotations.SerializedName
import kz.muragul.multiplatform.domain.model.Category

data class CategoryResponse(
    @SerializedName("categories")
    val categories: List<Category>
)
package kz.muragul.multiplatform.domain.model

import com.google.gson.annotations.SerializedName
import kz.muragul.multiplatform.domain.model.Recipe

data class RecipeResponse(
    @SerializedName("meals")
    val meals: List<Recipe>
)
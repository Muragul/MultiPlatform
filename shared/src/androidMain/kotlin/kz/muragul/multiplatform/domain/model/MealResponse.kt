package kz.muragul.multiplatform.domain.model

import com.google.gson.annotations.SerializedName
import kz.muragul.multiplatform.domain.model.Meal


data class MealResponse(
    @SerializedName("meals")
    val meals: List<Meal>
)
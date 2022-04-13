package kz.muragul.multiplatform.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kz.muragul.multiplatform.data.repository.CategoriesRepositoryImpl

class CategoryViewModel : ViewModel() {

    val liveData = MutableLiveData<String>()

    fun getCategories() {
        viewModelScope.launch(Dispatchers.Main) {
            val list = withContext(Dispatchers.IO) {
                val response = CategoriesRepositoryImpl().loadData()
                if (response.isSuccessful)
                    response.body()?.categories?.map { it -> it.strCategory }.toString()
                else
                    "Error"
            }
            liveData.value = list
        }
    }

}
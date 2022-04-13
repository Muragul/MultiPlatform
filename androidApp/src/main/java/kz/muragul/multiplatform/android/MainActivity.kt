package kz.muragul.multiplatform.android

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kz.muragul.multiplatform.Greeting
import kz.muragul.multiplatform.viewmodel.CategoryViewModel

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {

    private val viewModel = CategoryViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.text_view)
        tv.text = greet()

        viewModel.getCategories()
        viewModel.liveData.observe(this) { response ->
            tv.text = response
        }
    }

}

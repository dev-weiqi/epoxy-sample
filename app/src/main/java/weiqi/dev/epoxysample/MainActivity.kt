package weiqi.dev.epoxysample

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import weiqi.dev.epoxysample.controller.MainEpoxyController
import java.util.*

class MainActivity : AppCompatActivity() {

    private val controller = MainEpoxyController()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.run {
            adapter = controller.adapter
            layoutManager = LinearLayoutManager(this@MainActivity)
            setHasFixedSize(true)
            addItemDecoration(
                DividerItemDecoration(
                    this@MainActivity,
                    DividerItemDecoration.VERTICAL
                )
            )
        }

        controller.list = getColorInfoList()
        controller.requestModelBuild()
    }

    private fun getColorInfoList(): List<ColorInfo> {
        return mutableListOf<ColorInfo>().apply {
            repeat(50) {
                val random = Random()
                val rgb = Color.rgb(
                    random.nextInt(255),
                    random.nextInt(255),
                    random.nextInt(255)
                )
                add(ColorInfo(rgb, "num ${it + 1}"))
            }
        }
    }
}
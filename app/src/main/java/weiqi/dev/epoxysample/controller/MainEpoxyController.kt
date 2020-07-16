package weiqi.dev.epoxysample.controller

import com.airbnb.epoxy.AutoModel
import com.airbnb.epoxy.EpoxyController
import weiqi.dev.epoxysample.ColorInfo
import weiqi.dev.epoxysample.model.ColorModel_
import weiqi.dev.epoxysample.model.HeaderModel_

class MainEpoxyController : EpoxyController() {

    @AutoModel
    lateinit var headerModel: HeaderModel_

    var list: List<ColorInfo> = emptyList()

    override fun buildModels() {
        add(headerModel)

        list.forEachIndexed { index, item ->
            ColorModel_()
                .id(index)
                .color(item)
                .addTo(this)
        }
    }
}

package weiqi.dev.epoxysample.model

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import kotlinx.android.synthetic.main.item_color.view.*
import weiqi.dev.epoxysample.ColorInfo
import weiqi.dev.epoxysample.R

@EpoxyModelClass(layout = R.layout.item_color)
abstract class ColorModel : EpoxyModelWithHolder<ColorModel.ViewHolder>() {

    @EpoxyAttribute
    lateinit var color: ColorInfo

    override fun bind(holder: ViewHolder) {
        holder.run {
            imgColor.setBackgroundColor(color.argb)
            tvText.text = color.text
        }
    }

    class ViewHolder : EpoxyHolder() {

        lateinit var imgColor: ImageView
        lateinit var tvText: TextView

        override fun bindView(itemView: View) {
            imgColor = itemView.imgColor
            tvText = itemView.tvText
        }
    }
}
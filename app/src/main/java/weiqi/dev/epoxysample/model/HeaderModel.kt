package weiqi.dev.epoxysample.model

import android.view.View
import android.widget.TextView
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import kotlinx.android.synthetic.main.item_color.view.*
import weiqi.dev.epoxysample.R

@EpoxyModelClass(layout = R.layout.item_header)
abstract class HeaderModel : EpoxyModelWithHolder<HeaderModel.ViewHolder>() {

    override fun bind(holder: ViewHolder) {
        holder.tvText.text = "HEADER"
    }

    class ViewHolder : EpoxyHolder() {

        lateinit var tvText: TextView

        override fun bindView(itemView: View) {
            tvText = itemView.tvText
        }
    }
}
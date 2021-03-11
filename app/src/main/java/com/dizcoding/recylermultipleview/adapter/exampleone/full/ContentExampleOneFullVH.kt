package com.dizcoding.recylermultipleview.adapter.exampleone.full

import android.view.View
import com.dizcoding.mylibrv.AbstractViewHolder
import com.dizcoding.recylermultipleview.R
import com.dizcoding.recylermultipleview.databinding.ContentExampleOneFullBinding

class ContentExampleOneFullVH(itemView: View) : AbstractViewHolder<ExampleOneFullModel>(itemView) {
    private val binding = ContentExampleOneFullBinding.bind(itemView)

    companion object {
        val LAYOUT = R.layout.content_example_one_full
    }

    override fun bind(element: ExampleOneFullModel) {
        with(binding) {
            tvCenter.text = element.centerText
        }
    }
}
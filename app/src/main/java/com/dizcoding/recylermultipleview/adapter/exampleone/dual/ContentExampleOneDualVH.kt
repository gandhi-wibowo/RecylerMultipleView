package com.dizcoding.recylermultipleview.adapter.exampleone.dual

import android.view.View
import com.dizcoding.mylibrv.AbstractViewHolder
import com.dizcoding.recylermultipleview.R
import com.dizcoding.recylermultipleview.databinding.ContentExampleOneDualBinding

class ContentExampleOneDualVH(itemView: View) : AbstractViewHolder<ExampleOneDualModel>(itemView) {
    private val binding = ContentExampleOneDualBinding.bind(itemView)

    companion object {
        val LAYOUT = R.layout.content_example_one_dual
    }

    override fun bind(element: ExampleOneDualModel) {
        with(binding) {
            tvLeft.text = element.leftText
            tvRight.text = element.rightText
        }
    }
}
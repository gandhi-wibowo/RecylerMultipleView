package com.dizcoding.recylermultipleview.adapter.exampleone.half

import android.view.View
import com.dizcoding.mylibrv.AbstractViewHolder
import com.dizcoding.recylermultipleview.R
import com.dizcoding.recylermultipleview.databinding.ContentExampleOneHalfBinding

class ContentExampleOneHalfVH(itemView: View) : AbstractViewHolder<ExampleOneHalfModel>(itemView) {
    private val binding = ContentExampleOneHalfBinding.bind(itemView)

    companion object {
        val LAYOUT = R.layout.content_example_one_half
    }

    override fun bind(element: ExampleOneHalfModel) {
        with(binding) {
            tvLeft.text = element.leftText
        }
    }
}
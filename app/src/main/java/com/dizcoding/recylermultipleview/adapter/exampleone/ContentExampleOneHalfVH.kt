package com.dizcoding.recylermultipleview.adapter.exampleone

import android.view.View
import com.dizcoding.mylibrv.AbstractViewHolder
import com.dizcoding.recylermultipleview.R
import com.dizcoding.recylermultipleview.databinding.ContentExampleOneHalfBinding

class ContentExampleOneHalfVH(itemView: View) : AbstractViewHolder<ExampleOneModel>(itemView) {
    private val binding = ContentExampleOneHalfBinding.bind(itemView)

    companion object {
        val LAYOUT = R.layout.content_example_one_half
    }

    override fun bind(element: ExampleOneModel) {
        with(binding){
            tvLeft.text = element.data[0]
        }
    }
}
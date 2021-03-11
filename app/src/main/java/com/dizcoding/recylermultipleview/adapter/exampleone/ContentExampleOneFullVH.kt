package com.dizcoding.recylermultipleview.adapter.exampleone

import android.view.View
import com.dizcoding.mylibrv.AbstractViewHolder
import com.dizcoding.recylermultipleview.R
import com.dizcoding.recylermultipleview.databinding.ContentExampleOneFullBinding
import com.dizcoding.recylermultipleview.databinding.ContentExampleOneHalfBinding

class ContentExampleOneFullVH(itemView: View) : AbstractViewHolder<ExampleOneModel>(itemView) {
    private val binding = ContentExampleOneFullBinding.bind(itemView)

    companion object {
        val LAYOUT = R.layout.content_example_one_full
    }

    override fun bind(element: ExampleOneModel) {
        with(binding){
            tvCenter.text = element.data[0]
        }
    }
}
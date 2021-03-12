package com.dizcoding.recylermultipleview.adapter.exampletwo.left

import android.view.View
import com.bumptech.glide.Glide
import com.dizcoding.mylibrv.AbstractViewHolder
import com.dizcoding.recylermultipleview.R
import com.dizcoding.recylermultipleview.databinding.ContentExampleTwoLeftBinding

class ExampleTwoLeftVH(itemView: View) : AbstractViewHolder<ExampleTwoLeftModel>(itemView) {
    private val binding = ContentExampleTwoLeftBinding.bind(itemView)

    companion object {
        val LAYOUT = R.layout.content_example_two_left
    }

    override fun bind(element: ExampleTwoLeftModel) {
        with(binding) {
            tvChat.text = element.textChat

            Glide.with(itemView.context)
                .load(element.urlUserIcon)
                .circleCrop()
                .into(ivChat)
        }
    }
}
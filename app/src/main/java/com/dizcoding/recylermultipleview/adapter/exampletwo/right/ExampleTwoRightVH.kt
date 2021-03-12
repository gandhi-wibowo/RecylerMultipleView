package com.dizcoding.recylermultipleview.adapter.exampletwo.right

import android.view.View
import com.bumptech.glide.Glide
import com.dizcoding.mylibrv.AbstractViewHolder
import com.dizcoding.recylermultipleview.R
import com.dizcoding.recylermultipleview.databinding.ContentExampleTwoRightBinding

class ExampleTwoRightVH(itemView: View) : AbstractViewHolder<ExampleTwoRightModel>(itemView) {
    private val binding = ContentExampleTwoRightBinding.bind(itemView)

    companion object {
        val LAYOUT = R.layout.content_example_two_right
    }

    override fun bind(element: ExampleTwoRightModel) {
        with(binding) {
            tvChat.text = element.textChat

            Glide.with(itemView.context)
                .load(element.urlUserIcon)
                .circleCrop()
                .into(ivChat)
        }
    }
}
package com.dizcoding.recylermultipleview.adapter.exampleone

import android.view.View
import com.dizcoding.mylibrv.AbstractViewHolder
import com.dizcoding.mylibrv.BaseItemTypeFactory

class ExampleOneFactoryImpl : BaseItemTypeFactory {
    override fun createViewHolder(parent: View, type: Int): AbstractViewHolder<*> {
        return when (type) {
            ContentExampleOneDualVH.LAYOUT -> ContentExampleOneDualVH(parent)
            ContentExampleOneHalfVH.LAYOUT -> ContentExampleOneHalfVH(parent)
            ContentExampleOneFullVH.LAYOUT -> ContentExampleOneFullVH(parent)
            else -> createViewHolder(parent, type)
        }
    }
}
package com.dizcoding.recylermultipleview.adapter.exampleone

import android.view.View
import com.dizcoding.mylibrv.AbstractViewHolder
import com.dizcoding.recylermultipleview.adapter.exampleone.dual.ContentExampleOneDualVH
import com.dizcoding.recylermultipleview.adapter.exampleone.dual.ExampleOneDualModel
import com.dizcoding.recylermultipleview.adapter.exampleone.full.ContentExampleOneFullVH
import com.dizcoding.recylermultipleview.adapter.exampleone.full.ExampleOneFullModel
import com.dizcoding.recylermultipleview.adapter.exampleone.half.ContentExampleOneHalfVH
import com.dizcoding.recylermultipleview.adapter.exampleone.half.ExampleOneHalfModel

class ExampleOneTypeFactoryImpl : ExampleOneTypeFactory {
    override fun type(typeFactory: ExampleOneDualModel): Int = ContentExampleOneDualVH.LAYOUT
    override fun type(typeFactory: ExampleOneFullModel): Int = ContentExampleOneFullVH.LAYOUT
    override fun type(typeFactory: ExampleOneHalfModel): Int = ContentExampleOneHalfVH.LAYOUT
    override fun createViewHolder(parent: View, type: Int): AbstractViewHolder<*> {
        return when (type) {
            ContentExampleOneDualVH.LAYOUT -> ContentExampleOneDualVH(parent)
            ContentExampleOneHalfVH.LAYOUT -> ContentExampleOneHalfVH(parent)
            ContentExampleOneFullVH.LAYOUT -> ContentExampleOneFullVH(parent)
            else -> createViewHolder(parent, type)
        }
    }
}
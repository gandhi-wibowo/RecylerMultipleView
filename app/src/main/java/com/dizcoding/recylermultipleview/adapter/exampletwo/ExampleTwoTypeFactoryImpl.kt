package com.dizcoding.recylermultipleview.adapter.exampletwo

import android.view.View
import com.dizcoding.mylibrv.AbstractViewHolder
import com.dizcoding.recylermultipleview.adapter.exampletwo.left.ExampleTwoLeftModel
import com.dizcoding.recylermultipleview.adapter.exampletwo.left.ExampleTwoLeftVH
import com.dizcoding.recylermultipleview.adapter.exampletwo.right.ExampleTwoRightModel
import com.dizcoding.recylermultipleview.adapter.exampletwo.right.ExampleTwoRightVH

class ExampleTwoTypeFactoryImpl : ExampleTwoTypeFactory {
    override fun type(typeFactory: ExampleTwoLeftModel): Int = ExampleTwoLeftVH.LAYOUT

    override fun type(typeFactory: ExampleTwoRightModel): Int = ExampleTwoRightVH.LAYOUT

    override fun createViewHolder(parent: View, type: Int): AbstractViewHolder<*> {

        return when (type) {
            ExampleTwoLeftVH.LAYOUT -> ExampleTwoLeftVH(parent)
            ExampleTwoRightVH.LAYOUT -> ExampleTwoRightVH(parent)
            else -> createViewHolder(parent, type)
        }
    }
}
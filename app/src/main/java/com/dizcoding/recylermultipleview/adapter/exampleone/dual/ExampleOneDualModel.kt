package com.dizcoding.recylermultipleview.adapter.exampleone.dual

import com.dizcoding.mylibrv.BaseItemModel
import com.dizcoding.mylibrv.BaseItemTypeFactory
import com.dizcoding.recylermultipleview.adapter.exampleone.ExampleOneTypeFactory

data class ExampleOneDualModel(
    val leftText: String,
    val rightText: String
) : BaseItemModel() {

    override fun type(typeFactoryBase: BaseItemTypeFactory): Int {
        return (typeFactoryBase as ExampleOneTypeFactory).type(this)
    }

}
package com.dizcoding.recylermultipleview.adapter.exampleone.half

import com.dizcoding.mylibrv.BaseItemModel
import com.dizcoding.mylibrv.BaseItemTypeFactory
import com.dizcoding.recylermultipleview.adapter.exampleone.ExampleOneTypeFactory


data class ExampleOneHalfModel(
    val leftText: String
) : BaseItemModel() {

    override fun type(typeFactoryBase: BaseItemTypeFactory): Int {
        return (typeFactoryBase as ExampleOneTypeFactory).type(this)
    }

}
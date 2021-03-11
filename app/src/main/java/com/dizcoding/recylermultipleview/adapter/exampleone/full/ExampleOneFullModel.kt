package com.dizcoding.recylermultipleview.adapter.exampleone.full

import com.dizcoding.mylibrv.BaseItemModel
import com.dizcoding.mylibrv.BaseItemTypeFactory
import com.dizcoding.recylermultipleview.adapter.exampleone.ExampleOneTypeFactory


data class ExampleOneFullModel(
    val centerText: String
) : BaseItemModel() {

    override fun type(typeFactoryBase: BaseItemTypeFactory): Int {
        return (typeFactoryBase as ExampleOneTypeFactory).type(this)
    }

}
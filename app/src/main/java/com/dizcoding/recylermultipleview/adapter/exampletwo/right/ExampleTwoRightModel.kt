package com.dizcoding.recylermultipleview.adapter.exampletwo.right

import com.dizcoding.mylibrv.BaseItemModel
import com.dizcoding.mylibrv.BaseItemTypeFactory
import com.dizcoding.recylermultipleview.adapter.exampletwo.ExampleTwoTypeFactory

data class ExampleTwoRightModel(
    val textChat: String,
    val urlUserIcon: String = "https://cdn.elgoog.im/thanos/thanos-infinity-gauntlet-snap-google-trick.jpg"
) : BaseItemModel() {

    override fun type(typeFactoryBase: BaseItemTypeFactory): Int {
        return (typeFactoryBase as ExampleTwoTypeFactory).type(this)
    }

}
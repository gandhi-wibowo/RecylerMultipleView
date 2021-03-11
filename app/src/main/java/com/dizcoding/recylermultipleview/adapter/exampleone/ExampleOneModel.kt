package com.dizcoding.recylermultipleview.adapter.exampleone

import com.dizcoding.mylibrv.BaseItemModel
import com.dizcoding.mylibrv.BaseItemTypeFactory
// 0 : left view , 1 : dual view, 2 : fullview
data class ExampleOneModel(
    val data : List<String> = listOf(),
    val thePosition : Int
) : BaseItemModel(){

    override fun type(typeFactoryBase: BaseItemTypeFactory): Int {
        if (thePosition == 0) typeVH = ContentExampleOneHalfVH.LAYOUT
        else if (thePosition == 1) typeVH = ContentExampleOneDualVH.LAYOUT
        else if (thePosition == 2) typeVH = ContentExampleOneFullVH.LAYOUT
        return typeFactoryBase.type(this)
    }

}
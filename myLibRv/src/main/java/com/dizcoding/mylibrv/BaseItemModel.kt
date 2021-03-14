package com.dizcoding.mylibrv


abstract class BaseItemModel(
    var isSelected: Boolean = false,
    var itemIndex : Int = 0
) {

    abstract fun type(typeFactoryBase: BaseItemTypeFactory): Int
}
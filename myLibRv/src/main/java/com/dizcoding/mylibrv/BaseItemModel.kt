package com.dizcoding.mylibrv


abstract class BaseItemModel(
    var isSelected: Boolean = false
) {

    abstract fun type(typeFactoryBase: BaseItemTypeFactory): Int
}
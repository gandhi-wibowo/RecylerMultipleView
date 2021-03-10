package com.dizcoding.mylibrv


abstract class BaseItemModel(
    var isSelected: Boolean = false,
    var typeVH: Int = 0,
    var priorityQueue: Int = 0
) {
    abstract fun type(typeFactoryBase: BaseItemTypeFactory): Int
}
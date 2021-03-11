package com.dizcoding.recylermultipleview.adapter.exampleone

import com.dizcoding.mylibrv.BaseItemTypeFactory
import com.dizcoding.recylermultipleview.adapter.exampleone.dual.ExampleOneDualModel
import com.dizcoding.recylermultipleview.adapter.exampleone.full.ExampleOneFullModel
import com.dizcoding.recylermultipleview.adapter.exampleone.half.ExampleOneHalfModel

interface ExampleOneTypeFactory : BaseItemTypeFactory {
    fun type(typeFactory: ExampleOneDualModel): Int
    fun type(typeFactory: ExampleOneFullModel): Int
    fun type(typeFactory: ExampleOneHalfModel): Int

}
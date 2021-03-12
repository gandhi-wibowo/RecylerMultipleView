package com.dizcoding.recylermultipleview.adapter.exampletwo

import com.dizcoding.mylibrv.BaseItemTypeFactory
import com.dizcoding.recylermultipleview.adapter.exampletwo.left.ExampleTwoLeftModel
import com.dizcoding.recylermultipleview.adapter.exampletwo.right.ExampleTwoRightModel

interface ExampleTwoTypeFactory : BaseItemTypeFactory {
    fun type(typeFactory: ExampleTwoLeftModel): Int
    fun type(typeFactory: ExampleTwoRightModel): Int
}
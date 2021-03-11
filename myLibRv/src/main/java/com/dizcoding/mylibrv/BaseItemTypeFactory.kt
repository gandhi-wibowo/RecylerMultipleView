package com.dizcoding.mylibrv

import android.view.View

interface BaseItemTypeFactory {
    fun createViewHolder(parent: View, type: Int): AbstractViewHolder<*>
}
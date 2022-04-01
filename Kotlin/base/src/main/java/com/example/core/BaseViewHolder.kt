package com.example.core

import android.view.View
import android.widget.TextView
import androidx.annotation.IdRes
import androidx.recyclerview.widget.RecyclerView.ViewHolder

abstract class BaseViewHolder(itemView: View) : ViewHolder(itemView) {
    private val viewHashMap: MutableMap<Int, View?> = mutableMapOf()

    protected fun <T : View> getView(@IdRes id: Int): T? {
        return (viewHashMap[id] ?: itemView.findViewById<View?>(id).apply {
            viewHashMap[id] = this
        }) as T?
    }

    protected fun setText(@IdRes id: Int, text: String) {
        (getView<View>(id) as TextView).text = text
    }
}
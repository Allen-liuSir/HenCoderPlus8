package com.example.core.utils

import android.content.res.Resources
import android.util.DisplayMetrics
import android.util.TypedValue
import kotlin.jvm.JvmOverloads
import android.widget.Toast
import com.example.core.BaseApplication

val displayMetrics: DisplayMetrics = Resources.getSystem().displayMetrics

fun Float.dp2px(): Float {
    return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, this, displayMetrics)
}

object Utils {

    @JvmOverloads
    @JvmStatic
    fun toast(string: String?, duration: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(BaseApplication.application, string, duration).show()
    }
}
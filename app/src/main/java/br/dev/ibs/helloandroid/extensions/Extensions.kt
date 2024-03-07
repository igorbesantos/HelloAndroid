package br.dev.ibs.helloandroid.extensions

import android.app.Activity
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.IdRes

/**
 * Show Toast
 */
fun Activity.toast(message: CharSequence, length: Int = Toast.LENGTH_SHORT) =
    Toast.makeText(this, message, length).show()

/**
 * Configure click event handler
 */
fun Activity.onClick(@IdRes viewId: Int, onClick:(v: View?) -> Unit) {
    val view = findViewById<View>(viewId)
    view.setOnClickListener(onClick)
}

/**
 * Return a TextView's text
 */
fun Activity.getTextString(@IdRes id: Int): String = findViewById<TextView>(id).text.toString()

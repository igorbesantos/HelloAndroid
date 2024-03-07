package br.dev.ibs.helloandroid.debug

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

open class DebugActivity: AppCompatActivity() {
    private val debugTag = "LIFECYCLE_DEBUG"

    private val className: String

    init {
        val s = javaClass.name
        this.className = s.substring((s.lastIndexOf(".") + 1))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(debugTag, "${className}.onCreate() called: $savedInstanceState")
    }

    override fun onStart() {
        super.onStart()
        Log.d(debugTag, "${className}.onStart() called.")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(debugTag, "${className}.onRestart() called.")
    }

    override fun onResume() {
        super.onResume()
        Log.d(debugTag, "${className}.onResume() called.")
    }

    override fun onPause() {
        super.onPause()
        Log.d(debugTag, "${className}.onPause() called.")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(debugTag, "${className}.onSaveInstanceState(Bundle) called: $outState")
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        Log.d(debugTag, "${className}.onSaveInstanceState(Bundle, PersistableBundle) called: [ $outState | $outPersistentState ] ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(debugTag, "${className}.onStop() called.")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(debugTag, "${className}.onDestroy() called.")
    }
}
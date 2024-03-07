package br.dev.ibs.helloandroid

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import br.dev.ibs.helloandroid.debug.DebugActivity
import br.dev.ibs.helloandroid.extensions.getTextString
import br.dev.ibs.helloandroid.extensions.onClick
import br.dev.ibs.helloandroid.extensions.toast

class MainActivity: DebugActivity() {
    private val tag = "LOG_TESTS"
    private val context: Context get() = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        testLogs()
        configureButtonActions()
    }

    private fun configureButtonActions() {
        onClick(R.id.btLogin) {
            val user = getTextString(R.id.tLogin)
            val password = getTextString(R.id.tPassword)
            if (user.isNotBlank() && password == "123") {
                toast("Welcome, login successful!")
                redirectToWelcomeActivity(user)
            } else {
                toast("Incorrect credentials (Password = 123).")
            }
        }
    }

    private fun redirectToWelcomeActivity(userName: String) {
        val params = Bundle()
        params.putString("name", userName)

        val intent = Intent(context, WelcomeActivity::class.java)
        intent.putExtras(params)

        startActivity(intent)
    }

    private fun testLogs() {
        Log.v(tag, "Verbose log test")
        Log.d(tag, "Debug log test")
        Log.i(tag, "Info log test")
        Log.w(tag, "Warning log test")
        Log.e(tag, "Error log test")
    }
}

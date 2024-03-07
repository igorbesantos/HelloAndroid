package br.dev.ibs.helloandroid

import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView
import br.dev.ibs.helloandroid.debug.DebugActivity

class WelcomeActivity : DebugActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val args = intent.extras
        val name = args?.getString("name")

        val textView = findViewById<TextView>(R.id.tWelcome)
        textView.text = getString(R.string.welcome, "$name")

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            // Handle back button click
            finish()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}
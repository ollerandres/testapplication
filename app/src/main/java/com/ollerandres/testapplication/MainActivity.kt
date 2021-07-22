package com.ollerandres.testapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.ollerandres.testapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val TAG = MainActivity::class.java.name

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "called onCreate")
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        binding.btnSendEmail.setOnClickListener {
            // Snackbar.make(binding.root, "Send Email Button tapped", Snackbar.LENGTH_SHORT).show()
            navigateToSecondScreen()
            // sendEmail()
            // clearFields()
        }

        binding.btnSendEmail.setOnLongClickListener {
            // Toast.makeText(this, "Send Email Button long pressed", LENGTH_SHORT).show()
            true
        }
    }

    private fun navigateToSecondScreen() {
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }

    private fun clearFields() {
        binding.email.text?.clear()
        binding.subject.text?.clear()
        binding.message.text?.clear()
    }

    private fun sendEmail() {
        val intent = Intent(Intent.ACTION_SEND)
        intent.type = "text/plain"
        intent.putExtra(Intent.EXTRA_EMAIL, arrayOf(binding.email.text))
        intent.putExtra(Intent.EXTRA_SUBJECT, binding.subject.text)
        intent.putExtra(Intent.EXTRA_TEXT, binding.message.text)
        val mailer = Intent.createChooser(intent, "Send email using")
        startActivity(mailer)
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "called onRestart")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "called onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "called onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "called onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "called onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "called onDestroy")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(TAG, "called onSaveInstanceState")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d(TAG, "called onRestoreInstanceState")
    }
}

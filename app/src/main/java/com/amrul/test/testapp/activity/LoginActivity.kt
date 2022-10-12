package com.amrul.test.testapp.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.amrul.test.testapp.R

class LoginActivity : AppCompatActivity() {

    private lateinit var usernameEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var btnLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        usernameEditText = findViewById(R.id.username)
        passwordEditText = findViewById(R.id.password)

        usernameEditText.setText(R.string.username)
        passwordEditText.setText(R.string.password)

        btnLogin = findViewById(R.id.btnLogin)
        btnLogin.setOnClickListener { validateCredential() }
    }

    private fun validateCredential() {
        val username = usernameEditText.text.toString()
        val password = passwordEditText.text.toString()

        when {
            username.isEmpty() -> Toast.makeText(this,"username is empty", Toast.LENGTH_SHORT).show()
            username != getString(R.string.username) -> Toast.makeText(this, " username is wrong", Toast.LENGTH_SHORT).show()
            password.isEmpty() -> Toast.makeText(this,"password is empty", Toast.LENGTH_SHORT).show()
            password != getString(R.string.password) -> Toast.makeText(this, " password is wrong", Toast.LENGTH_SHORT).show()
            else -> gotoMainActivity()
        }
    }

    private fun gotoMainActivity() {
        val mainIntent = Intent(this@LoginActivity, MainActivity::class.java)
        startActivity(mainIntent)
        finish()
    }
}
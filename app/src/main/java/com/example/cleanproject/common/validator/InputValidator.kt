package com.example.cleanproject.common.validator

import android.util.Patterns

object InputValidator {

    fun isValidEmail(email: String) =
        Patterns.EMAIL_ADDRESS.matcher(email).matches()

    fun isValidPassword(password: String) =
        password.length >= 6
}

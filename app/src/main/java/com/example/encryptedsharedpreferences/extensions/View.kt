package com.example.encryptedsharedpreferences.extensions


import android.widget.TextView
import androidx.annotation.NonNull
import io.noties.markwon.Markwon

/*
Created by ​
Hannure Abdulrahim
on 10/22/2021.
*/

fun TextView.markDown(@NonNull markdownText: String) {
    Markwon.create(this.context).also {
        it.setMarkdown(this, markdownText)
    }
}


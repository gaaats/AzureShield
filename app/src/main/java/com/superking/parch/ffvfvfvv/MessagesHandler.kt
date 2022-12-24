package com.superking.parch.ffvfvfvv

import android.content.Context
import android.content.DialogInterface
import androidx.appcompat.app.AlertDialog


class MessagesHandler (val cooontext :Context) {
    private val messages = ArrayList<String>()

    init {
        messages.add("One")
        messages.add("Two")
        messages.add("Three")
        messages.add("Four")
        displayMessage(0)
    }

    fun displayMessage(index: Int) {
        var index = index
        if (index < 0) {
            return
        }
        val builder1 = AlertDialog.Builder(cooontext)
        builder1.setMessage(messages[index])
        builder1.setCancelable(true)
        builder1.setPositiveButton("Yes",
            DialogInterface.OnClickListener { dialog, id ->
                dialog.cancel()
                displayMessage(++index)
            })
        builder1.setNegativeButton("No",
            DialogInterface.OnClickListener { dialog, id ->
                dialog.cancel()
                displayMessage(++index)
            })
        val alert11: AlertDialog = builder1.create()
        alert11.show()
    }
}
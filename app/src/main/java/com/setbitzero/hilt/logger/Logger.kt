package com.setbitzero.hilt.logger

import android.util.Log
import javax.inject.Inject

class Logger @Inject constructor() {
    fun log(msg: String){
        Log.wtf("SEND", msg)
    }
}
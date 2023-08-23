package com.setbitzero.hilt.reporitory

import com.setbitzero.hilt.logger.Logger
import javax.inject.Inject

class Repository @Inject constructor(private val logger: Logger) {// constructor injection
    fun sendMail(){
        logger.log("Email Send")
    }
}
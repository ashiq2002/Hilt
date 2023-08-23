package com.setbitzero.hilt

import android.app.Application
import com.setbitzero.hilt.reporitory.Repository
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class MainApplication: Application() {
    @Inject
    lateinit var repository: Repository // field injection

    override fun onCreate() {
        super.onCreate()

        repository.sendMail()
    }

}
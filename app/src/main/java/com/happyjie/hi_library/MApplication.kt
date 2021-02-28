package com.happyjie.hi_library

import android.app.Application
import com.google.gson.Gson
import com.happyjie.hilibrary.log.*
import com.happyjie.hilibrary.util.ActivityManager

class MApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        HiLogManager.init(
            object : HiLogConfig() {
                override fun injectJsonParser(): JsonParser {
                    return JsonParser { src -> Gson().toJson(src) }
                }

                override fun getGlobalTag(): String {
                    return "MApplication"
                }

                override fun enable(): Boolean {
                    return true;
                }
            }, HiConsolePrinter(),
            HiFilePrinter.getInstance(applicationContext.cacheDir.absolutePath, 0)
        );

        ActivityManager.instance.init(this)
    }
}
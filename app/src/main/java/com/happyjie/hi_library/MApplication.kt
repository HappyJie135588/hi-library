package com.happyjie.hi_library

import android.app.Application
import com.google.gson.Gson
import com.happyjie.hilibrary.log.HiConsolePrinter
import com.happyjie.hilibrary.log.HiLogConfig
import com.happyjie.hilibrary.log.HiLogManager
import com.happyjie.hilibrary.log.HiViewPrinter

class MApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        HiLogManager.init(object: HiLogConfig(){
            override fun injectJsonParser(): JsonParser {
                return JsonParser { src -> Gson().toJson(src) }
            }
            override fun getGlobalTag(): String {
                return "MApplication"
            }

            override fun enable(): Boolean {
                return true;
            }
        },HiConsolePrinter());
    }
}
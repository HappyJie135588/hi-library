package com.happyjie.hi_library.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.happyjie.hi_library.R
import com.happyjie.hilibrary.log.*
import kotlinx.android.synthetic.main.activity_hi_log_demo.*

class HiLogDemoActivity : AppCompatActivity() {
    var viewPrinter: HiViewPrinter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hi_log_demo)
        viewPrinter = HiViewPrinter(this)
        btn_log.setOnClickListener {
            printLog()
        }
        viewPrinter!!.viewProvider.showFloatingView()
        HiLogManager.getInstance().addPrinter(viewPrinter)

    }

    private fun printLog() {

        //自定义Log配置
        HiLog.log(object :HiLogConfig(){
            override fun includeThread(): Boolean {
                return true
            }

            override fun stackTraceDepth(): Int {
                return 0
            }

        },HiLogType.E,"-----","5566")
        HiLog.a("9900")
    }
}

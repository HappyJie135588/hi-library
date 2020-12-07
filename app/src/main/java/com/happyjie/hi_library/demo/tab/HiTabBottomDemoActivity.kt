package com.happyjie.hi_library.demo.tab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.happyjie.hi_library.R
import com.happyjie.hiui.tab.bottom.HiTabBottomInfo
import kotlinx.android.synthetic.main.activity_hi_tab_bottom_demo.*

class HiTabBottomDemoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hi_tab_bottom_demo)
        val homeInfo = HiTabBottomInfo(
            "首页",
            "fonts/iconfont.ttf",
            getString(R.string.if_home),
            null,
            "#ff656667",
            "#ffd44949"
        )
        tab_bottom.setHiTabInfo(homeInfo)
    }
}

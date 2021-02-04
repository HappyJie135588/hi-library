package com.happyjie.hi_library.demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.happyjie.hi_library.R
import com.happyjie.hi_library.demo.refresh.HiRefreshLottieActivity
import com.happyjie.hi_library.demo.refresh.HiRefreshTextActivity
import com.happyjie.hi_library.demo.tab.HiTabBottomDemoActivity
import com.happyjie.hi_library.demo.tab.HiTabTopDemoActivity
import kotlinx.android.synthetic.main.activity_hi_ui_demo.*

class HiUiDemoActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hi_ui_demo)
        tv_tab_bottom.setOnClickListener(this)
        tv_hi_refresh_text.setOnClickListener(this)
        tv_hi_refresh_lottie.setOnClickListener(this)
        tv_hi_banner.setOnClickListener(this)
        tv_hi_taptop.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.tv_tab_bottom -> {
                startActivity(Intent(this, HiTabBottomDemoActivity::class.java))
            }
            R.id.tv_hi_refresh_text -> {
                startActivity(Intent(this, HiRefreshTextActivity::class.java))
            }
            R.id.tv_hi_refresh_lottie -> {
                startActivity(Intent(this, HiRefreshLottieActivity::class.java))
            }
            R.id.tv_hi_banner -> {
                startActivity(Intent(this, HiBannerDemoActivity::class.java))
            }
            R.id.tv_hi_taptop -> {
                startActivity(Intent(this, HiTabTopDemoActivity::class.java))
            }
        }
    }
}

package com.happyjie.hi_library.demo.refresh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.happyjie.hi_library.R
import com.happyjie.hiui.tab.refresh.HiRefresh
import com.happyjie.hiui.tab.refresh.HiTextOverView
import kotlinx.android.synthetic.main.activity_hi_refresh_text.*

class HiRefreshTextActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hi_refresh_text)

        val xOverView = HiTextOverView(this)
        refresh_layout.setRefreshOverView(xOverView)
        refresh_layout.setRefreshListener(object : HiRefresh.HiRefreshListener {
            override fun enableRefresh(): Boolean {
                return true;
            }

            override fun onRefresh() {
                Handler().postDelayed({ refresh_layout.refreshFinished() }, 1000)
            }

        })

    }
}

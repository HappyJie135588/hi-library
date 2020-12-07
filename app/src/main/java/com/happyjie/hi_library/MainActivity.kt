package com.happyjie.hi_library

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.happyjie.hi_library.demo.log.HiLogDemoActivity
import com.happyjie.hi_library.demo.HiUiDemoActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv_hilog.setOnClickListener(this)
        tv_hiui.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.tv_hilog -> {
                startActivity(Intent(this, HiLogDemoActivity::class.java))
            }
            R.id.tv_hiui -> {
                startActivity(Intent(this, HiUiDemoActivity::class.java))
            }
        }
    }
}

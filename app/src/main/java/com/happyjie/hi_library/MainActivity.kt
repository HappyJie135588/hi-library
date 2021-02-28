package com.happyjie.hi_library

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.happyjie.hi_library.demo.manager.HiManagerActivity
import com.happyjie.hi_library.demo.HiUiDemoActivity
import com.happyjie.hi_library.demo.fragment.HiFragmentActivity
import com.happyjie.hi_library.demo.log.HiLogDemoActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv_hilog.setOnClickListener(this)
        tv_hiui.setOnClickListener(this)
        tv_manager.setOnClickListener(this)
        tv_fragment.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.tv_hilog -> {
                startActivity(Intent(this, HiLogDemoActivity::class.java))
            }
            R.id.tv_hiui -> {
                startActivity(Intent(this, HiUiDemoActivity::class.java))
            }
            R.id.tv_manager -> {
                startActivity(Intent(this, HiManagerActivity::class.java))
            }
            R.id.tv_fragment -> {
                startActivity(Intent(this, HiFragmentActivity::class.java))
            }
        }
    }
}

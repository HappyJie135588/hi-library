package com.happyjie.hi_library.demo.manager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.happyjie.hi_library.R
import com.happyjie.hilibrary.util.ActivityManager
import kotlinx.android.synthetic.main.activity_hi_manager.*

class HiManagerActivity : AppCompatActivity() {

    lateinit var callback: ActivityManager.FrontBackCallback

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hi_manager)

        callback = object : ActivityManager.FrontBackCallback {
            override fun onChanged(front: Boolean) {
                Toast.makeText(applicationContext, "当前处于：" + front, Toast.LENGTH_SHORT).show()
            }
        }
        ActivityManager.instance.addFrontBackCallback(callback)

        val topActivity = ActivityManager.instance.topActivity;
        if (topActivity != null) {
            tv_content.setText(topActivity.localClassName)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        ActivityManager.instance.removeFrontBackCallback(callback)
    }
}

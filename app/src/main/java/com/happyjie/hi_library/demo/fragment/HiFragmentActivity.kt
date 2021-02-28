package com.happyjie.hi_library.demo.fragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.happyjie.hi_library.R
import kotlinx.android.synthetic.main.activity_hi_fragment.*

class HiFragmentActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hi_fragment)

        tv_add.setOnClickListener(this)
        tv_view_pager2.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.tv_add -> {
                startActivity(Intent(this, AddFragmentActivity::class.java))
            }
            R.id.tv_view_pager2 -> {
                startActivity(Intent(this, ViewPager2Activity::class.java))
            }
        }
    }
}

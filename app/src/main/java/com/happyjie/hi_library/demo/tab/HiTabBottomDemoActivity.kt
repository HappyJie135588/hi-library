package com.happyjie.hi_library.demo.tab

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.happyjie.hi_library.R
import com.happyjie.hilibrary.util.HiDisplayUtil
import com.happyjie.hiui.tab.bottom.HiTabBottomInfo
import kotlinx.android.synthetic.main.activity_hi_tab_bottom_demo.*

class HiTabBottomDemoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hi_tab_bottom_demo)
        initView();
    }

    private fun initView() {
        tab_bottom.setTabAlpha(0.85f)
        val bottomInfoList: MutableList<HiTabBottomInfo<*>> = ArrayList();
        val homeInfo = HiTabBottomInfo(
            "首页",
            "fonts/iconfont.ttf",
            getString(R.string.if_home),
            null,
            "#ff656667",
            "#ffd44949"
        )
        val infoRecommend = HiTabBottomInfo(
            "收藏",
            "fonts/iconfont.ttf",
            getString(R.string.if_favorite),
            null,
            "#ff656667",
            "#ffd44949"
        )
//        val infoCategory = HiTabBottomInfo(
//            "分类",
//            "fonts/iconfont.ttf",
//            getString(R.string.if_category),
//            null,
//            "#ff656667",
//            "#ffd44949"
//        )
        val bitmap = BitmapFactory.decodeResource(resources, R.drawable.fire, null)
        val infoCategory = HiTabBottomInfo<String>(
            "分类",
            bitmap,
            bitmap
        )
        val infoChat = HiTabBottomInfo(
            "推荐",
            "fonts/iconfont.ttf",
            getString(R.string.if_recommend),
            null,
            "#ff656667",
            "#ffd44949"
        )
        val infoProfile = HiTabBottomInfo(
            "我的",
            "fonts/iconfont.ttf",
            getString(R.string.if_profile),
            null,
            "#ff656667",
            "#ffd44949"
        )
        bottomInfoList.add(homeInfo)
        bottomInfoList.add(infoRecommend)
        bottomInfoList.add(infoCategory)
        bottomInfoList.add(infoChat)
        bottomInfoList.add(infoProfile)
        tab_bottom.inflateInfo(bottomInfoList)
        tab_bottom.addTabSelectedChangeListener { index, prevInfo, nextInfo ->
            Toast.makeText(this@HiTabBottomDemoActivity, nextInfo.name, Toast.LENGTH_SHORT).show()
        }
        tab_bottom.defaultSelected(homeInfo)
        val tabBottom = tab_bottom.findTab(bottomInfoList[2])
        tabBottom?.apply { resetHeight(HiDisplayUtil.dp2px(66f, resources)) }
    }
}

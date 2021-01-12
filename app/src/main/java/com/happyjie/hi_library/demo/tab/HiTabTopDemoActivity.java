package com.happyjie.hi_library.demo.tab;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.widget.Toast;

import com.happyjie.hi_library.R;
import com.happyjie.hi_library.databinding.ActivityHiTabTopDemoBinding;
import com.happyjie.hiui.tab.common.IHiTabLayout;
import com.happyjie.hiui.tab.top.HiTabTopInfo;
import com.happyjie.hiui.tab.top.HiTabTopLayout;

import java.util.ArrayList;
import java.util.List;

public class HiTabTopDemoActivity extends AppCompatActivity {

    String[] tabsStr = new String[]{
            "热门",
            "服装",
            "数码",
            "鞋子",
            "零食",
            "家电",
            "汽车",
            "百货",
            "家居",
            "装修",
            "运动"
    };
    private ActivityHiTabTopDemoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_hi_tab_top_demo);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_hi_tab_top_demo);
        initTabTop();
    }

    private void initTabTop() {
        List<HiTabTopInfo<?>> infoList = new ArrayList<>();
        int defaultColor = getResources().getColor(R.color.tabBottomDefaultColor);
        int tintColor = getResources().getColor(R.color.tabBottomTintColor);
        for (String s : tabsStr) {
            HiTabTopInfo<?> info = new HiTabTopInfo<Integer>(s, defaultColor, tintColor);
            infoList.add(info);
        }
        binding.tabTopLayout.inflateInfo(infoList);
        binding.tabTopLayout.addTabSelectedChangeListener(new IHiTabLayout.OnTabSelectedListener<HiTabTopInfo<?>>() {
            @Override
            public void onTabSelectedChange(int index, @Nullable HiTabTopInfo<?> prevInfo, @NonNull HiTabTopInfo<?> nextInfo) {
                Toast.makeText(HiTabTopDemoActivity.this, nextInfo.name, Toast.LENGTH_SHORT).show();
            }
        });
        binding.tabTopLayout.defaultSelected(infoList.get(0));
    }
}

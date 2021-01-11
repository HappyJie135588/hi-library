package com.happyjie.hiui.tab.top;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;

import androidx.annotation.NonNull;

import com.happyjie.hiui.tab.common.IHiTabLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HJ on 2021/1/11.
 *
 * @link
 * @description:
 */
public class HiTabTopLayout extends HorizontalScrollView implements IHiTabLayout<HiTabTop, HiTabTopInfo> {
    private List<OnTabSelectedListener<HiTabTopInfo<?>>> tabSelectedChangeListeners = new ArrayList<>();
    private HiTabTopInfo<?> selectedInfo;
    private List<HiTabTopInfo<?>> infoList;

    public HiTabTopLayout(Context context) {
        super(context);
    }

    public HiTabTopLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public HiTabTopLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public HiTabTop findTab(@NonNull HiTabTopInfo data) {
        return null;
    }

    @Override
    public void addTabSelectedChangeListener(OnTabSelectedListener<HiTabTopInfo> listener) {

    }

    @Override
    public void defaultSelected(@NonNull HiTabTopInfo defaultInfo) {

    }

    @Override
    public void inflateInfo(@NonNull List<HiTabTopInfo> infoList) {

    }
}

package com.cnt.coolweather;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2017/11/4.
 */

public class SimpleLayout extends ViewGroup {
    public SimpleLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if(getChildCount()>0){
            View chileView = getChildAt(0);
            measureChild(chileView,widthMeasureSpec,heightMeasureSpec);
        }
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        if(getChildCount()>0){
            View chileView = getChildAt(0);
            chileView.layout(0,0,chileView.getMeasuredWidth(),chileView.getMeasuredHeight());
        }
    }
}

package com.github.kongpf8848.animation.widget;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import android.util.AttributeSet;

/**
 * Created by pengf on 2017/3/22.
 */

public class MyImageView extends AppCompatImageView {


    private int index;

    public MyImageView(Context context) {
        super(context);
    }

    public MyImageView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyImageView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setAa(float zhy) {
        setAlpha(zhy);
        setScaleX(zhy);
        setScaleY(zhy);
    }
}

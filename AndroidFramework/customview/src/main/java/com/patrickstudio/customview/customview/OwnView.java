package com.patrickstudio.customview.customview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import com.patrickstudio.customview.R;

public class OwnView extends View {
    private final int DEFAULT_SIZE = 500;
    private final int DEFAULT_FILL_COLOR = 1;
    private final String TAG = getClass().toString();
    private Paint backgroundPaint;

    public OwnView(Context context) {
        super(context);
        init(DEFAULT_FILL_COLOR);
    }

    public OwnView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        int fillColor;
        TypedArray ta =
                context.getTheme().obtainStyledAttributes(attrs,
                        R.styleable.OwnView, 0, 0);
        try {
            fillColor = ta.getColor(R.styleable.OwnView_fillColor,
                    DEFAULT_FILL_COLOR);
        } finally {
            ta.recycle();
        }
        init(fillColor);
    }

    private void init(int fillColor) {
        backgroundPaint = new Paint();
        backgroundPaint.setStyle(Paint.Style.FILL);
        setFillColor(fillColor);
    }
    public void setFillColor(int fillColor) {
        backgroundPaint.setColor(fillColor);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        // vẽ một hình nền chữ nhật với màu đỏ đã được thiết lập
        canvas.drawRect(0,0, getWidth(), getHeight(), backgroundPaint);
        super.onDraw(canvas);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int width = getMeasurementSize(widthMeasureSpec, DEFAULT_SIZE);
        int height = getMeasurementSize(heightMeasureSpec,
                DEFAULT_SIZE);
        setMeasuredDimension(width, height);
    }

    //hàm xác định kích thước thật sự của view
    private static int getMeasurementSize(int measureSpec, int defaultSize) {
        int mode = MeasureSpec.getMode(measureSpec);
        int size = MeasureSpec.getSize(measureSpec);
        switch(mode) {
            case MeasureSpec.EXACTLY: // nếu nó có kích thước chính xác thì mình giữ nguyên kích thước đó
                return size;
            case MeasureSpec.AT_MOST: // nếu nó có kính thước bị giới hạn bởi một view parent thì mình chọn kích thước nhỏ hơn
                return Math.min(defaultSize, size);
            case MeasureSpec.UNSPECIFIED: // nếu nó có kích thước không xác định thì mình dùng kính thước mặc định
            default:
                return defaultSize;
        }
    }


}

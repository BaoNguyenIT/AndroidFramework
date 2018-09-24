package com.patrickstudio.customview.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;


public class OwnTextView extends AppCompatTextView { // dùng AppCompatTextView để kế thừa vì nó bổ sung nhiều tính năng mới
    private Paint backgroundPaint;
    public OwnTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        backgroundPaint= new Paint();
        backgroundPaint.setColor(0xffff0000);
        backgroundPaint.setStyle(Paint.Style.FILL);
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
    }
}

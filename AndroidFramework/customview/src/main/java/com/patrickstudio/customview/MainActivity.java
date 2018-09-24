package com.patrickstudio.customview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.patrickstudio.customview.customview.OwnView;

public class MainActivity extends AppCompatActivity {
    private static final int BRIGHT_GREEN = 0xff00ff00;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // khởi tại một linear layout
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setLayoutParams(
                new LinearLayout.LayoutParams(ViewGroup.
                        LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.MATCH_PARENT));
        OwnView customView = new OwnView(this);
        customView.setFillColor(BRIGHT_GREEN);
        linearLayout.addView(customView);
        setContentView(linearLayout);
    }
}

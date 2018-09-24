package com.patrickstudio.recyclerviewclickpattern;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    private final static String CONTENT_EXTRAS = "data";
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        textView = (TextView) findViewById(R.id.detail_text_view);
        Intent intent = getIntent();
        textView.setText(intent.getStringExtra(CONTENT_EXTRAS));
    }
}

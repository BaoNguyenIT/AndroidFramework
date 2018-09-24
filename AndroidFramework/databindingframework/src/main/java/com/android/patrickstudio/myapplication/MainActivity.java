package com.android.patrickstudio.myapplication;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.android.patrickstudio.myapplication.Model.User;
import com.android.patrickstudio.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding biding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        User user = new User("Nguyễn", "Quốc Bảo");
        biding.setUser(user);
    }
}

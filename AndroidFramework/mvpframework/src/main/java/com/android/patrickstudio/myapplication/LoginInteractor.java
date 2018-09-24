package com.android.patrickstudio.myapplication;

/**
 * Created by PATRICKLAGGER on 7/7/2017.
 */

public interface LoginInteractor {
    public void login(String username, String password, OnLoginFinishedListener listener);
}

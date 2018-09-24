package com.android.patrickstudio.myapplication;

/**
 * Created by PATRICKLAGGER on 7/7/2017.
 */

public interface LoginView {
    public void showProgress();

    public void hideProgress();

    public void setUserNameError();

    public void setPasswordError();

    public void navigateToHome();
}

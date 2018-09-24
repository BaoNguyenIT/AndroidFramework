package com.android.patrickstudio.myapplication;

/**
 * Created by PATRICKLAGGER on 7/7/2017.
 */

public class LoginPresenterImpl implements LoginPresenter, OnLoginFinishedListener {
    private LoginView loginView;
    private LoginInteractor loginInteractor;

    public LoginPresenterImpl(LoginView loginView) {
        this.loginView = loginView;
        this.loginInteractor = new LoginInteractorImpl();
    }

    @Override
    public void validateCredentials(String username, String password) {

    }

    @Override
    public void OnUsernameError() {

    }

    @Override
    public void OnPasswordError() {

    }

    @Override
    public void OnSuccess() {

    }
}

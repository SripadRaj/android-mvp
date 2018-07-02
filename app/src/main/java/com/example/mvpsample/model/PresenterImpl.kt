package com.example.mvpsample.model

import com.example.mvpsample.presenter.LoginPresenter
import com.example.mvpsample.view.LoginView

/**
 * Created by SRamesh on 6/29/2018.
 */
class PresenterImpl: LoginPresenter {


    var loginView : LoginView? = null

    constructor(loginView: LoginView?) {
        this.loginView = loginView
    }


    override fun performLogin(userName: String, password: String) {
        if(userName.isNotEmpty() || password.isNotEmpty()){
            loginView?.loginSuccess()
        }
    }
}
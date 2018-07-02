package com.example.mvpsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.mvpsample.model.PresenterImpl
import com.example.mvpsample.presenter.LoginPresenter
import com.example.mvpsample.view.LoginView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener,LoginView{

    var loginPresenter : LoginPresenter ? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_login.setOnClickListener(this)
        loginPresenter = PresenterImpl(this)

    }

    override fun onClick(p0: View) {
        when(p0.id){
            R.id.btn_login -> loginPresenter?.performLogin(et_username.text.toString(),et_password.text.toString())
        }
    }

    override fun loginSuccess() {
        Toast.makeText(this,"Success",Toast.LENGTH_SHORT).show()
    }

}

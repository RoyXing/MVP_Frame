package com.demo;

import com.yxt.mvp.BaseEntity;
import com.yxt.mvp.BasePresenter;

/**
 * @author roy.xing
 * @date 2019-07-03
 */
public class LoginPresenter extends BasePresenter<LoginModel, MainActivity, LoginContract.Presenter> {

    @Override
    public LoginContract.Presenter getContract() {
        return new LoginContract.Presenter() {
            @Override
            public void requestLogin(String name, String password) {
                try {
                    getModel().getContract().executeLogin(name, password);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void responseResult(BaseEntity baseEntity) {
                getView().getContract().handlerResult(baseEntity);
            }
        };
    }

    @Override
    public LoginModel getModel() {
        return new LoginModel(this);
    }
}

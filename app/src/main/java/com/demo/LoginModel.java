package com.demo;

import com.yxt.mvp.BaseModel;

/**
 * @author roy.xing
 * @date 2019-07-03
 */
public class LoginModel extends BaseModel<LoginPresenter,LoginContract.Model> {

    public LoginModel(LoginPresenter loginPresenter) {
        super(loginPresenter);
    }

    @Override
    public LoginContract.Model getContract() {
        return new LoginContract.Model() {
            @Override
            public void executeLogin(String name, String password) throws Exception {
                if (name.equals("xingzy")&&password.equals("123456")){
                    p.getContract().responseResult(new UserInfo("yxt","邢正一"));
                }else {
                    p.getContract().responseResult(null);
                }
            }
        };
    }
}

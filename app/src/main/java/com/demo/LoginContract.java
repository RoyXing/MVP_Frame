package com.demo;

import com.yxt.mvp.BaseEntity;

/**
 * @author roy.xing
 * @date 2019-07-02
 * 将Model层、View层、presenter层协商的共同业务，封装成接口
 * 契约合同
 */
public interface LoginContract {

    interface Model {

        //Model层子类完成方法的具体实现
        void executeLogin(String name, String password) throws Exception;
    }

    interface View<T extends BaseEntity> {

        void handlerResult(T t);
    }

    interface Presenter<T extends BaseEntity> {

        //登录请求（接收到View层指令，可以自己做，也可以让model层去执行）
        void requestLogin(String name, String password);

        //结果响应(接收到Model层处理的结果，通知view层刷新)
        void responseResult(T t);
    }
}

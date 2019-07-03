package com.yxt.mvp;

/**
 * @author roy.xing
 * @date 2019-07-03
 * 接收到P层交给它的需求（基类）
 */
public abstract class BaseModel <P extends  BasePresenter,CONTRACT> {

    public P p;

    // 业务结束，通过Presenter调用契约、合同（接口中的方法）
    public BaseModel(P p) {
        this.p = p;
    }

    public abstract CONTRACT getContract();
}

package com.yxt.mvp;

/**
 * @author roy.xing
 * @date 2019-07-03
 */
public abstract class BaseModel <P extends  BasePresenter,CONTRACT> {

    public P p;

    public BaseModel(P p) {
        this.p = p;
    }

    public abstract CONTRACT getContract();
}

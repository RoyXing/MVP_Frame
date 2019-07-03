package com.yxt.mvp;

import java.lang.ref.WeakReference;

/**
 * @author roy.xing
 * @date 2019-07-03
 */
public abstract class BasePresenter<M extends BaseModel, V extends BaseView, CONTRACT> {

    public M m;
    private WeakReference<V> vWeakReference;

    public BasePresenter() {
        m = getModel();
    }

    public void bindView(V v) {
        vWeakReference = new WeakReference<>(v);
    }

    public void unbind() {
        if (vWeakReference != null) {
            vWeakReference.clear();
            vWeakReference = null;
            System.gc();
        }
    }

    public V getView() {
        if (vWeakReference != null) {
           return vWeakReference.get();
        }
        return null;
    }

    public abstract M getModel();

    public abstract CONTRACT getContract();
}

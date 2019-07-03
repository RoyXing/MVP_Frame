package com.yxt.mvp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * @author roy.xing
 * @date 2019-07-03
 */
public abstract class BaseView<P extends BasePresenter, CONTRACT> extends AppCompatActivity {

    public P p;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 弱引用
        p = getPresenter();
        // 绑定
        p.bindView(this);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (p!=null){
            p.unbind();
        }
    }

    // 如果Presenter层出现了异常，需要告知View层
    public void error(Exception e) {}


    // 让P层做什么需求
    public abstract P getPresenter();

    // 从子类中获取具体的契约
    public abstract CONTRACT getContract();
}

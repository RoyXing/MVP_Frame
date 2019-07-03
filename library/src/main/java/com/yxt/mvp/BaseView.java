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

        p = getPresenter();

        p.bindView(this);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (p!=null){
            p.unbind();
        }
    }

    public abstract P getPresenter();

    public abstract CONTRACT getContract();
}

package com.lib.legend.mvp_temp.base_activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.lib.legend.mvp_temp.base_presenter.BasePresenter;

public abstract class BasePresenterActivity<V,T extends BasePresenter<V>> extends AppCompatActivity {


    protected T presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter=createPresenter();
        presenter.attachView((V) this);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();

        presenter.detachView();
    }

    protected abstract T createPresenter();

}

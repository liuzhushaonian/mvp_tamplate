package com.app.legend.demo;

import android.os.Bundle;

import com.lib.legend.mvp_temp.base_activity.BasePresenterActivity;

public class MainActivity extends BasePresenterActivity<IMainActivity,MainPresenter> implements IMainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 初始化presenter
     * @return
     */
    @Override
    protected MainPresenter createPresenter() {
        return new MainPresenter(this);
    }
}

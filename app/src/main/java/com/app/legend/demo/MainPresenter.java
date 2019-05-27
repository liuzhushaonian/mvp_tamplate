package com.app.legend.demo;

import com.lib.legend.mvp_temp.base_presenter.BasePresenter;

public class MainPresenter extends BasePresenter<IMainActivity> {

    private IMainActivity activity;

    public MainPresenter(IMainActivity activity) {

        attachView(activity);

        this.activity = getView();
    }


}

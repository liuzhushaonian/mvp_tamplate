package com.app.legend.demo;

import com.lib.legend.mvp_temp.base_presenter.BasePresenter;

public class MyFragmentPresenter extends BasePresenter<IMyFragment> {

    private IMyFragment fragment;

    public MyFragmentPresenter(IMyFragment fragment) {
        attachView(fragment);
        this.fragment = getView();
    }
}

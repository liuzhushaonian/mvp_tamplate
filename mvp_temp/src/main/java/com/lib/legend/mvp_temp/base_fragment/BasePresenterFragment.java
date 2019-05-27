package com.lib.legend.mvp_temp.base_fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import com.lib.legend.mvp_temp.base_presenter.BasePresenter;

/**
 * A simple {@link Fragment} subclass.
 */
public abstract class BasePresenterFragment<V,T extends BasePresenter<V>> extends Fragment {

    protected T presenter;

    public BasePresenterFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter=createPresenter();

        presenter.attachView((V) this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        presenter.detachView();
    }

    protected abstract T createPresenter();
}

package com.app.legend.demo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lib.legend.mvp_temp.base_fragment.BasePresenterFragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyFragment extends BasePresenterFragment<IMyFragment,MyFragmentPresenter> implements IMyFragment{


    public MyFragment() {
        // Required empty public constructor
    }

    /**
     * 初始化presenter
     * @return
     */
    @Override
    protected MyFragmentPresenter createPresenter() {
        return new MyFragmentPresenter(this);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my, container, false);
    }

}

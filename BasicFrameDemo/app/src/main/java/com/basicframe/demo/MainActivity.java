package com.basicframe.demo;

import android.view.View;

import com.base.framework.activity.ReBaseActivity;
import com.base.framework.presenter.BasePresenter;
import com.base.framework.viewWiget.common.TopBarView;

public class MainActivity extends ReBaseActivity {

    @Override
    protected TestPresenter createPresenter() {
        return null;
    }

    @Override
    protected void initTopBarView(TopBarView topBarView) {

    }

    @Override
    protected int getContentResID() {
        return R.layout.activity_main;
    }

    @Override
    protected int createHeaderView() {
        return R.layout.activity_main;
    }

    @Override
    public void beforeInitView() {

    }

    @Override
    public void initContentView(View contentView) {

    }

    @Override
    public void loadData(BasePresenter presenter) {

    }

    @Override
    public void setListener() {

    }


}

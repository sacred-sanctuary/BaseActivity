/*
 * Copyright (C) 2016 Sacred Sanctuary Inc.
 */
/**
 * @file    MainFragment.java
 * @author  New Making          2016.09.01  LUNA
 */
package jp.sacredsanctuary.baseactivity.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import jp.sacredsanctuary.baseactivity.R;
import jp.sacredsanctuary.common.base.fragment.BaseFragment;
import jp.sacredsanctuary.common.util.LogUtil;

public class MainFragment extends BaseFragment {
    private static final String TAG = LogUtil.TAG;
    private static final String CLASS_NAME = MainFragment.class.getSimpleName();

    public MainFragment() {
        super(CLASS_NAME);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             Bundle savedInstanceState) {
        LogUtil.V(TAG, CLASS_NAME, "onCreateView() [I N] ");
        super.onCreateView(inflater, container, savedInstanceState);

        View view = inflater.inflate(R.layout.fragment_main, container, false);

        LogUtil.V(TAG, CLASS_NAME, "onCreateView() [OUT] ");
        return view;
    }
}

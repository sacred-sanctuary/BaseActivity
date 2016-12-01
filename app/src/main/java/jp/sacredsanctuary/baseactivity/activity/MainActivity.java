/*
 * Copyright (C) 2016 Sacred Sanctuary Inc.
 */
/**
 * @file    MainActivity.java
 * @author  New Making          2016.09.01  LUNA
 */
package jp.sacredsanctuary.baseactivity.activity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

import jp.sacredsanctuary.baseactivity.R;
import jp.sacredsanctuary.baseactivity.fragment.MainFragment;
import jp.sacredsanctuary.baseactivity.util.LogUtil;

public class MainActivity extends BaseActivity {
    private static final String TAG = LogUtil.TAG;
    private static final String CLASS_NAME = MainActivity.class.getSimpleName();

    public MainActivity() {
        super(CLASS_NAME);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        LogUtil.V(TAG, CLASS_NAME, "onCreate() [I N] ");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        MainFragment fragment = new MainFragment();
        fragmentTransaction.add(R.id.fragment_container, fragment, "fragment_main");
        fragmentTransaction.commit();
        LogUtil.V(TAG, CLASS_NAME, "onCreate() [I N] ");
    }
}

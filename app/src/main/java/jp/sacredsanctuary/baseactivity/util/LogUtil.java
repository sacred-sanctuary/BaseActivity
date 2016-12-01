/*
 * Copyright (C) 2016 Sacred Sanctuary Inc.
 */
/**
 * @file    LogUtil.java
 * @author  New Making          2016.09.01  LUNA
 * @note    <br>
 * VERBOSE: adb shell setprop log.tag.BaseActivity VERBOSE<br>
 * DEBUG:   adb shell setprop log.tag.BaseActivity DEBUG<br>
 * INFO:   adb shell setprop log.tag.BaseActivity INFO
 */
package jp.sacredsanctuary.baseactivity.util;

import android.util.Log;

public class LogUtil {
    public final static String TAG = "BaseActivity";
    public final static boolean VERBOSE = Log.isLoggable(TAG, Log.VERBOSE);
    public final static boolean DEBUG = Log.isLoggable(TAG, Log.DEBUG);

    public static void V(String TAG, String ClassName, String log) {
        if (VERBOSE) {
            Log.v(TAG, "[" + ClassName + "] " + log);
        }
    }

    public static void V(String ClassName, String log) {
        if (VERBOSE) {
            Log.v(TAG, "[" + ClassName + "] " + log);
        }
    }

    public static void D(String TAG, String ClassName, String log) {
        if (DEBUG) {
            Log.d(TAG, "[" + ClassName + "] " + log);
        }
    }

    public static void D(String ClassName, String log) {
        if (DEBUG) {
            Log.d(TAG, "[" + ClassName + "] " + log);
        }
    }

    public static void I(String TAG, String ClassName, String log) {
        Log.i(TAG, "[" + ClassName + "] " + log);
    }

    public static void I(String ClassName, String log) {
        Log.i(TAG, "[" + ClassName + "] " + log);
    }

    public static void W(String TAG, String ClassName, String log) {
        Log.w(TAG, "[" + ClassName + "] " + log);
    }

    public static void W(String ClassName, String log) {
        Log.w(TAG, "[" + ClassName + "] " + log);
    }

    public static void E(String TAG, String ClassName, String log) {
        Log.e(TAG, "[" + ClassName + "] " + log);
    }

    public static void E(String ClassName, String log) {
        Log.e(TAG, "[" + ClassName + "] " + log);
    }
}

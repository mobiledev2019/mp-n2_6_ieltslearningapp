package com.lamtt.learnenglish.utils;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

public class Constant {

    public static final String CATEGORY_TAG = "tag";
    public static final String CATEGORY_TITLE = "category_title";
    public static final String EMAIL_ACCOUNT = "email_account";
    public static final String RANDOM_QUIZ_TAG = "random_quiz";
    public static final String BROADCAST_SPEAK = "com.lamtt.broadcastspeak";
    public static final String BROADCAST_TEXT_SPEAK = "text_speak";
    public static final String NOTICE_MINUTE = "minute_notice";
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void showToat(Context context, String str) {
        Toast.makeText(context, str, Toast.LENGTH_SHORT).show();
    }

    public static boolean isNetWorkAvailable(Activity activity) {
        NetworkInfo netInfo = ((ConnectivityManager) activity.getSystemService("connectivity")).getActiveNetworkInfo();
        return netInfo != null && netInfo.isConnectedOrConnecting();
    }
}

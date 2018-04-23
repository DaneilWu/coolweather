package com.example.cdloving.coolweather.util;

/**
 * Created by CDLoving on 2018/4/23.
 */

public interface HttpCallbackListener {
    void onFinish(String response);

    void onErrot(Exception e);
}

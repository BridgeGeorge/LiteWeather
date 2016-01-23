package org.bridge.liteweather.util;

/**
 * http请求接口回调
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);

}

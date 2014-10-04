package net.suool.suoolweather.util;

/**
 * 回调返回接口
 * Created by SuooL on 2014/10/4.
 */
public interface HttpCallbackListener {

    void onFinish(String response);

    void onError(Exception e);

}

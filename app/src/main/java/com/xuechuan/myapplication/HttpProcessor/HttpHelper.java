package com.xuechuan.myapplication.HttpProcessor;

import java.util.HashMap;
import java.util.Map;

/**
 * @version V 1.0 xxxxxxxx
 * @Title: frame
 * @Package com.xuechuan.myapplication.HttpProcessor
 * @Description: todo
 * @author: L-BackPacker
 * @date: 2018/9/12 14:32
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2018
 */
public class HttpHelper implements IHttpProcessor {
    private static IHttpProcessor mIHttpProcessor = null;

    private Map<String, Object> mParams;
    private static HttpHelper _instance;

    private HttpHelper() {
        mParams = new HashMap<>();
    }

    public static void init(IHttpProcessor iHttpProcessor) {
        mIHttpProcessor = iHttpProcessor;
    }

    public static HttpHelper obtain() {
        synchronized (HttpHelper.class) {
            if (_instance == null) {
                _instance = new HttpHelper();
            }
        }
        return _instance;
    }


    @Override
    public void post(String url, Map<String, Object> params, ICallBack callBack) {
        final String finaUrl = appendParams(url, params);
        mIHttpProcessor.post(url, params, callBack);
    }

    private String appendParams(String url, Map<String, Object> params) {
        return null;
    }

    @Override
    public void get(String url, Map<String, Object> params, ICallBack callBack) {
        final String finaUrl = appendParams(url, params);
        mIHttpProcessor.get(url, params, callBack);
    }
}

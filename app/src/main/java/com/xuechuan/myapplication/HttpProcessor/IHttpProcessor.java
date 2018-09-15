package com.xuechuan.myapplication.HttpProcessor;

import java.util.Map;

/**
 * @version V 1.0 xxxxxxxx
 * @Title: frame
 * @Package com.xuechuan.myapplication.HttpProcessor
 * @Description: todo
 * @author: L-BackPacker
 * @date: 2018/9/12 14:19
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2018
 */
public interface IHttpProcessor {
    void post(String url, Map<String, Object> params, ICallBack callBack);

    void get(String url, Map<String, Object> params, ICallBack callBack);
}

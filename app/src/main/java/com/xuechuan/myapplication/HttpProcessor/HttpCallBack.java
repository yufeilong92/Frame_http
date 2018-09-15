package com.xuechuan.myapplication.HttpProcessor;

import com.google.gson.Gson;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @version V 1.0 xxxxxxxx
 * @Title: frame
 * @Package com.xuechuan.myapplication.HttpProcessor
 * @Description: todo
 * @author: L-BackPacker
 * @date: 2018/9/12 11:29
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2018
 */
public abstract class HttpCallBack<Result> implements ICallBack {
    @Override
    public void Success(String result) {
        Gson gson = new Gson();
        Class<?> clz = anaysisClasInfo(this);
        Result objResult = (Result) gson.fromJson(result, clz);
        onSuccess(objResult);

    }

    @Override
    public void Error(String e) {

    }

    public abstract void onSuccess(Result result);

    private static Class<?> anaysisClasInfo(Object o) {
        Type getType = o.getClass().getGenericSuperclass();
        Type[] params = ((ParameterizedType) getType).getActualTypeArguments();
        return (Class<?>) params[0];
    }
}

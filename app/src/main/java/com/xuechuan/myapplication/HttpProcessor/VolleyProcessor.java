package com.xuechuan.myapplication.HttpProcessor;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.Map;

/**
 * @version V 1.0 xxxxxxxx
 * @Title: frame
 * @Package com.xuechuan.myapplication.HttpProcessor
 * @Description: todo
 * @author: L-BackPacker
 * @date: 2018/9/12 14:35
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2018
 */
public class VolleyProcessor implements IHttpProcessor {


    private RequestQueue mQueue = null;

    public VolleyProcessor(Context context) {
        this.mContext = mContext;
        mQueue = Volley.newRequestQueue(context);
    }

    private Context mContext;
    private static VolleyProcessor service;
    public static VolleyProcessor getInstance(Context context) {
        if (service == null) {
            service = new VolleyProcessor(context);
        }
        return service;
    }


    @Override
    public void post(String url, Map<String, Object> params, final ICallBack callBack) {
        StringRequest stringRequest = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                callBack.Success(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                callBack.Error(error.toString());
            }
        });
    }

    @Override
    public void get(String url, Map<String, Object> params, ICallBack callBack) {

    }
}

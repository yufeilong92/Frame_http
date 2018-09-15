package com.xuechuan.myapplication.MyApplication;

import android.app.Application;

import com.xuechuan.myapplication.HttpProcessor.HttpHelper;
import com.xuechuan.myapplication.HttpProcessor.VolleyProcessor;

/**
 * @version V 1.0 xxxxxxxx
 * @Title: frame
 * @Package com.xuechuan.myapplication.MyApplication
 * @Description: todo
 * @author: L-BackPacker
 * @date: 2018/9/12 17:22
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2018
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        HttpHelper.init(VolleyProcessor.getInstance(this));
    }


}

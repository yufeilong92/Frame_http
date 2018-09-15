package com.xuechuan.myapplication.HttpProcessor;

/**
 * @version V 1.0 xxxxxxxx
 * @Title: frame
 * @Package com.xuechuan.myapplication.HttpProcessor
 * @Description: todo
 * @author: L-BackPacker
 * @date: 2018/9/12 11:52
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2018
 */
public interface ICallBack {
    public void Success(String result);

    public void Error(String e);
}

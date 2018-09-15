package com.xuechuan.myapplication;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.xuechuan.myapplication.HttpProcessor.HttpCallBack;
import com.xuechuan.myapplication.HttpProcessor.HttpHelper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mTvTitle;
    private Button mBtnPost;
    private String httpUrl = "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1536756264141&di=1875ce29c460df7505a0a929a154b4db&imgtype=0&src=http%3A%2F%2Fww2.sinaimg.cn%2Flarge%2Fbd759d6djw1euqebjcx3sj20go0cijry.jpg";
    private Map<String, Object> map = new HashMap<>();
    private ImageView mIvImager;

    public static final String TAG = "【" + MainActivity.class.getSimpleName() + "】==";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }




    private void initView() {
        mTvTitle = (TextView) findViewById(R.id.tv_title);
        mBtnPost = (Button) findViewById(R.id.btn_post);
        mBtnPost.setOnClickListener(this);
        mIvImager = (ImageView) findViewById(R.id.iv_imager);
        mIvImager.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_post:
                break;
        }
    }

}

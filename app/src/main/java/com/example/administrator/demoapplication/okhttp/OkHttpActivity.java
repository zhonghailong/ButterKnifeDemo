package com.example.administrator.demoapplication.okhttp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.administrator.demoapplication.R;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by Administrator on 2016/12/9.
 */

public class OkHttpActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.okhttp_activity);
//        getOkhttp();
    }

//    public void getOkhttp() {
//        OkHttpClient okHttpClient = new OkHttpClient();
//        Request request=new Request.Builder().url("http://apis.baidu.com/apistore/weatherservice/citylist?cityname=北京").
//                addHeader("apikey", "20113b43cce987146f854f63dfc8011c").get().build();
//
//        final Call call = okHttpClient.newCall(request);
//
//        /**
//         *   call.enqueue();//异步
//         call.execute()//同步，需要开线程
//         * */
//        new Thread() {
//            @Override
//            public void run() {
//                super.run();
//                try {
//                    Response response = call.execute();
//                    if (response.isSuccessful()) {
//                        Log.e("aaaaa", "成功");
//                        String json = response.body().string();
//                        Log.e("aaa", json);
//                    } else {
//                        Log.e("aaaaa", "失败");
//                    }
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }.start();
//
//
//    }
}

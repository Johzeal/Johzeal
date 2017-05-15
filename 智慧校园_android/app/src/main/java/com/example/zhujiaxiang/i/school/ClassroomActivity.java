package com.example.zhujiaxiang.i.school;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.zhujiaxiang.i.R;

/**
 * Created by zhujiaxiang on 17/4/24.
 */

public class ClassroomActivity extends SchoolActivity {
    private WebView classroom_web;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classroom);
        classroom_web = (WebView)findViewById(R.id.classroom_web);
        classroom_web.getSettings().setJavaScriptEnabled(true);
        classroom_web.getSettings().setBuiltInZoomControls(true);
        classroom_web.loadUrl("http://104.194.78.111/campus/building.html");
        classroom_web.getSettings().setLoadWithOverviewMode(true);
        classroom_web.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view,String url){
                view.loadUrl(url);
                return true;
            }
        });
    }

}

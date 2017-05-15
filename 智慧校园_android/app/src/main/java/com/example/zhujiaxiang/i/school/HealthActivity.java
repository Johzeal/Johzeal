package com.example.zhujiaxiang.i.school;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.zhujiaxiang.i.R;

/**
 * Created by zhujiaxiang on 17/4/25.
 */

public class HealthActivity extends SchoolActivity {
    private WebView health_web;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health);
        health_web = (WebView)findViewById(R.id.health_web);
        health_web.getSettings().setJavaScriptEnabled(true);
        health_web.getSettings().setBuiltInZoomControls(true);
        health_web.loadUrl("http://104.194.78.111/campus/map.html");
        health_web.getSettings().setLoadWithOverviewMode(true);
        health_web.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view,String url){
                view.loadUrl(url);
                return true;
            }
        });
    }
}

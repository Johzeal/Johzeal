package com.example.zhujiaxiang.i.school;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.zhujiaxiang.i.R;

/**
 * Created by zhujiaxiang on 17/4/23.
 */

public class WaterActivity extends SchoolActivity {
    private WebView water_web;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watersres);
        water_web = (WebView)findViewById(R.id.watersres_web);
        water_web.getSettings().setJavaScriptEnabled(true);
        water_web.getSettings().setBuiltInZoomControls(true);
        water_web.loadUrl("http://104.224.185.59/kf/watersource.html");
        water_web.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view,String url){
                view.loadUrl(url);
                return true;
            }
        });
    }

}

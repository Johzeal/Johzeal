package com.example.zhujiaxiang.i.find;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.zhujiaxiang.i.R;

/**
 * Created by zhujiaxiang on 17/4/25.
 */

public class CarActivity extends FindActivity {
    private WebView car_web;
    @Override
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_car);
        car_web = (WebView)findViewById(R.id.car_web);
        car_web.getSettings().setJavaScriptEnabled(true);
        car_web.getSettings().setBuiltInZoomControls(true);
        car_web.getSettings().setLoadWithOverviewMode(true);
        car_web.loadUrl("http://104.224.185.59/index.php");
        car_web.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view,String url){
                view.loadUrl(url);
                return true;
            }
        });
    }
}

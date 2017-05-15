package com.example.zhujiaxiang.i.school;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.zhujiaxiang.i.R;

/**
 * Created by zhujiaxiang on 17/4/23.
 */

public class CanteenActivity extends SchoolActivity {
    private WebView canteen_web;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canteen);
        canteen_web = (WebView)findViewById(R.id.canteen_web);
        canteen_web.getSettings().setJavaScriptEnabled(true);
        canteen_web.getSettings().setBuiltInZoomControls(true);
        canteen_web.getSettings().setLoadWithOverviewMode(true);
        canteen_web.loadUrl("http://104.224.185.59/kf/canteen.html");
        canteen_web.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view,String url){
                view.loadUrl(url);
                return true;
            }
        });
    }

}

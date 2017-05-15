package com.example.zhujiaxiang.i.find;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.zhujiaxiang.i.R;

/**
 * Created by zhujiaxiang on 17/4/25.
 */

public class CalendarActivity extends FindActivity {
    private WebView calendar_web;
    @Override
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_calendar);
        calendar_web = (WebView)findViewById(R.id.calendar_web);
        calendar_web.getSettings().setJavaScriptEnabled(true);
        calendar_web.getSettings().setBuiltInZoomControls(true);
        calendar_web.getSettings().setLoadWithOverviewMode(true);
        calendar_web.loadUrl("http://www.hrbnu.edu.cn/xnfw/xiaoli.html");
        calendar_web.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view,String url){
                view.loadUrl(url);
                return true;
            }
        });
    }
}

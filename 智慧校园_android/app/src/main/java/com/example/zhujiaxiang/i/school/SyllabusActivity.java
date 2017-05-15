package com.example.zhujiaxiang.i.school;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.zhujiaxiang.i.R;

/**
 * Created by zhujiaxiang on 17/4/24.
 */

public class SyllabusActivity extends SchoolActivity {
    private WebView syllabus_web;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus);
        syllabus_web = (WebView)findViewById(R.id.syllabus_web);
        syllabus_web.getSettings().setJavaScriptEnabled(true);
        syllabus_web.getSettings().setBuiltInZoomControls(true);
        syllabus_web.loadUrl("http://104.194.78.111/schedule/test.html");
        syllabus_web.getSettings().setLoadWithOverviewMode(true);
        syllabus_web.getSettings().setUseWideViewPort(true);
        syllabus_web.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view,String url){
                view.loadUrl(url);
                return true;
            }
        });
    }

}

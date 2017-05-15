package com.example.zhujiaxiang.i.find;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.zhujiaxiang.i.R;

/**
 * Created by zhujiaxiang on 17/4/25.
 */

public class LibraryActivity extends FindActivity {
    private WebView library_web;
    @Override
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_library);
        library_web = (WebView)findViewById(R.id.library_web);
        library_web.getSettings().setJavaScriptEnabled(true);
        library_web.getSettings().setBuiltInZoomControls(true);
        library_web.loadUrl("http://lib.hrbnu.edu.cn");
        library_web.getSettings().setLoadWithOverviewMode(true);
        library_web.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view,String url){
                view.loadUrl(url);
                return true;
            }
        });
    }
}

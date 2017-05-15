package com.example.zhujiaxiang.i.find;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.zhujiaxiang.i.R;

/**
 * Created by zhujiaxiang on 17/4/25.
 */

public class FinalResultActivity extends FindActivity {
    private WebView finalresult_web;
    @Override
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_finalresult);
        finalresult_web = (WebView)findViewById(R.id.finalresult_web);
        finalresult_web.getSettings().setJavaScriptEnabled(true);
        finalresult_web.getSettings().setBuiltInZoomControls(true);
        finalresult_web.getSettings().setLoadWithOverviewMode(true);
        finalresult_web.loadUrl("http://");
        finalresult_web.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view,String url){
                view.loadUrl(url);
                return true;
            }
        });
    }

}

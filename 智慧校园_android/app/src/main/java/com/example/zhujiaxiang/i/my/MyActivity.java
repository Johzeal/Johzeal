package com.example.zhujiaxiang.i.my;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.zhujiaxiang.i.MainActivity;
import com.example.zhujiaxiang.i.R;
import com.example.zhujiaxiang.i.find.FindActivity;
import com.example.zhujiaxiang.i.school.SchoolActivity;

/**
 * Created by zhujiaxiang on 17/5/3.
 */

public class MyActivity extends MainActivity {
    private Button schoolgray_btn3 = null;
    private Button findgray_btn3 = null;
    private Button myblue_btn3 = null;

    @Override
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_my);
        schoolgray_btn3 = (Button)findViewById(R.id.schoolgray_btn3);
        findgray_btn3 = (Button)findViewById(R.id.findgray_btn3);
        myblue_btn3 = (Button)findViewById(R.id.myblue_btn3);

        schoolgray_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyActivity.this, SchoolActivity.class);
                startActivity(intent);
                finish();
                overridePendingTransition(0,0);
            }
        });
        findgray_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyActivity.this, FindActivity.class);
                startActivity(intent);
                finish();
                overridePendingTransition(0,0);
            }
        });

    }
}

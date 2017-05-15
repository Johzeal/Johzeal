package com.example.zhujiaxiang.i.find;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.zhujiaxiang.i.MainActivity;
import com.example.zhujiaxiang.i.R;
import com.example.zhujiaxiang.i.my.MyActivity;
import com.example.zhujiaxiang.i.school.SchoolActivity;

/**
 * Created by zhujiaxiang on 17/4/25.
 */

public class FindActivity extends MainActivity {
    private Button car_btn = null;
    private Button finalresult_btn = null;
    private Button library_btn = null;
    private Button calendar_btn =null;

    private Button schoolgray_btn2 = null;
    private Button findblue_btn2 = null;
    private Button mygray_btn2 = null;
    @Override
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_find);
        car_btn = (Button)findViewById(R.id.car_btn);
        finalresult_btn = (Button)findViewById(R.id.finalresult_btn);
        library_btn = (Button)findViewById(R.id.library_btn);
        calendar_btn = (Button)findViewById(R.id.calendar_btn);
        schoolgray_btn2 = (Button)findViewById(R.id.schoolgray_btn2);
        mygray_btn2 = (Button)findViewById(R.id.mygray_btn2);


        car_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FindActivity.this,CarActivity.class);
                startActivity(intent);
            }
        });
        finalresult_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FindActivity.this,FinalResultActivity.class);
                startActivity(intent);
            }
        });

        library_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FindActivity.this,LibraryActivity.class);
                startActivity(intent);
            }
        });

        calendar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FindActivity.this,CalendarActivity.class);
                startActivity(intent);
            }
        });
        schoolgray_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FindActivity.this,SchoolActivity.class);
                startActivity(intent);
                finish();
                overridePendingTransition(0,0);
            }
        });
        mygray_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FindActivity.this,MyActivity.class);
                startActivity(intent);
                finish();
                overridePendingTransition(0,0);
            }
        });


    }

}

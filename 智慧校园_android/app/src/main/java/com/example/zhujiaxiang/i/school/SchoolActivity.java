package com.example.zhujiaxiang.i.school;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.AMapLocationListener;
import com.example.zhujiaxiang.i.MainActivity;
import com.example.zhujiaxiang.i.R;
import com.example.zhujiaxiang.i.find.FindActivity;
import com.example.zhujiaxiang.i.my.MyActivity;

import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 * Created by zhujiaxiang on 17/4/23.
 */

public class SchoolActivity extends MainActivity {
    private Button water_btn = null;
    private Button canteen_btn = null;
    private Button classroom_btn = null;
    private Button syllabus_btn = null;
    private Button health_btn  = null;
    private TextView state_txt = null;
    private TextView position_txt = null;
    private TextView course_txt = null;
    private Button schoolblue_btn1 = null;
    private Button findgray_btn1 = null;
    private Button mygray_btn1 = null;
    private String a = "";



    @Override
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_school);
        water_btn = (Button)findViewById(R.id.water_btn);
        canteen_btn = (Button)findViewById(R.id.dining_btn);
        classroom_btn = (Button)findViewById(R.id.classroom_btn);
        syllabus_btn = (Button)findViewById(R.id.schedule_btn) ;
        health_btn = (Button)findViewById(R.id.health_btn);
        state_txt = (TextView)findViewById(R.id.state);
//        schoolblue_btn1 = (Button)findViewById(R.id.schoolblue_btn1);
        findgray_btn1 = (Button)findViewById(R.id.findgray_btn1);
        mygray_btn1 = (Button)findViewById(R.id.mygray_btn1);
        position_txt = (TextView)findViewById(R.id.position);

//      三个TextView的显示数据
//        KJHttp kjHttp = new KJHttp();
//        HttpParams httpParams = new HttpParams();
//        HttpConfig httpConfig = new HttpConfig();
//        httpConfig.cacheTime = 0;
//        kjHttp.get("http://", httpParams, new HttpCallBack() {
//            @Override
//            public void onSuccess(String t) {
//                super.onSuccess(t);
//                try {
//                    JSONObject jsonObject = new JSONObject(t);
//                    JSONObject stuID = jsonObject.getJSONObject("");
//                    String state = stuID.getString("state");
//                    String position = stuID.getString("position");
//                    String course = stuID.getString("course");
//                    state_txt.setText("签到状态："+state);
//                    position_txt.setText("所在位置："+position);
//                    course_txt.setText("是否有课："+course);
//
//                } catch (JSONException e) {
//                    e.printStackTrace();
//                }
//            }
//        });

        water_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SchoolActivity.this,WaterActivity.class);
                startActivity(intent);
            }
        });
        canteen_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SchoolActivity.this,CanteenActivity.class);
                startActivity(intent);
            }
        });
        classroom_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SchoolActivity.this,ClassroomActivity.class);
                startActivity(intent);
            }
        });
        syllabus_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SchoolActivity.this,SyllabusActivity.class);
                startActivity(intent);
            }
        });
        health_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SchoolActivity.this, HealthActivity.class);
                startActivity(intent);
            }
        });
        findgray_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SchoolActivity.this, FindActivity.class);
                startActivity(intent);
                finish();
                overridePendingTransition(0,0);
            }
        });
        mygray_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SchoolActivity.this, MyActivity.class);
                startActivity(intent);
                finish();
                overridePendingTransition(0,0);
        }
    });

        //初始化定位
        mLocationClient = new AMapLocationClient(getApplicationContext());
        //设置定位回调监听
        mLocationClient.setLocationListener(mLocationListener);
        //初始化AMapLocationClientOption对象
        mLocationOption = new AMapLocationClientOption();
        //设置定位模式为AMapLocationMode.Hight_Accuracy，高精度模式。
        mLocationOption.setLocationMode(AMapLocationClientOption.AMapLocationMode.Hight_Accuracy);
        //设置是否允许模拟位置,默认为false，允许模拟位置
        mLocationOption.setMockEnable(false);
        mLocationOption.setOnceLocation(true);
        //单位是毫秒，默认30000毫秒，建议超时时间不要低于8000毫秒
        mLocationOption.setHttpTimeOut(10000);
        //给定位客户端对象设置定位参数
        mLocationClient.setLocationOption(mLocationOption);
//       子线程
        new Thread(new ThreadShow()).start();
    }

    // handler类接收数据
    Handler handler = new Handler() {
        public void handleMessage(Message msg) {
            if (msg.what == 1) {
                position_txt.setText("所在位置：" + a);
            }
        };
    };
    // 线程类
    class ThreadShow implements Runnable {

        @Override
        public void run() {
            // TODO Auto-generated method stub
            while (true) {
                try {
                    mLocationClient.startLocation();
                    //

                    Message msg = new Message();
                    msg.what = 1;
                    handler.sendMessage(msg);
                    Thread.sleep(8000);
                    mLocationClient.stopLocation();//停止定位后，本地定位服务并不会被销毁
                    mLocationClient.onDestroy();//销毁定位客户端，同时销毁本地定位服务。
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }


    //声明AMapLocationClientOption对象
    public AMapLocationClientOption mLocationOption = null;
    //声明AMapLocationClient类对象
    public AMapLocationClient mLocationClient = null;
    //声明定位回调监听器
    public AMapLocationListener mLocationListener = new AMapLocationListener() {
        @Override
        public void onLocationChanged(AMapLocation amapLocation) {
            if (amapLocation != null) {
                if (amapLocation.getErrorCode() == 0) {
                    //可在其中解析amapLocation获取相应内容。
                    amapLocation.getLocationType();//获取当前定位结果来源，如网络定位结果，详见定位类型表
                    amapLocation.getLatitude();//获取纬度
                    amapLocation.getLongitude();//获取经度
                    amapLocation.getAccuracy();//获取精度信息
                    a = amapLocation.getAddress();//地址，如果option中设置isNeedAddress为false，则没有此结果，网络定位结果中会有地址信息，GPS定位不返回地址信息。
                    amapLocation.getCountry();//国家信息
                    amapLocation.getProvince();//省信息
                    amapLocation.getCity();//城市信息
                    amapLocation.getDistrict();//城区信息
                    amapLocation.getStreet();//街道信息
                    amapLocation.getStreetNum();//街道门牌号信息
                    amapLocation.getCityCode();//城市编码
                    amapLocation.getAdCode();//地区编码
                    amapLocation.getAoiName();//获取当前定位点的AOI信息
                    amapLocation.getBuildingId();//获取当前室内定位的建筑物Id
                    amapLocation.getFloor();//获取当前室内定位的楼层
                    //获取定位时间
                    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    Date date = new Date(amapLocation.getTime());
                    df.format(date);

                    Message message = new Message();
                    message.obj = a;
                    handler.sendMessage(message);

                }else {
                    //定位失败时，可通过ErrCode（错误码）信息来确定失败的原因，errInfo是错误信息，详见错误码表。
                    Log.e("AmapError","location Error, ErrCode:"
                            + amapLocation.getErrorCode() + ", errInfo:"
                            + amapLocation.getErrorInfo());
                }
            }

        }
    };

}

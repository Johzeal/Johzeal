package com.example.zhujiaxiang.i;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.zhujiaxiang.i.school.SchoolActivity;

public class MainActivity extends AppCompatActivity {
    private Button loginBtn = null;
    public EditText stdnumEdt = null;
    public EditText passwordEdt = null;
    public String stdnum = null;
    public String password = null;
    private String state = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginBtn = (Button)findViewById(R.id.login_btn);
        stdnumEdt = (EditText)findViewById(R.id.stdnum_edit);
        passwordEdt = (EditText)findViewById(R.id.password_edit);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SchoolActivity.class);
                startActivity(intent);
//
//                stdnum = stdnumEdt.getText().toString();
//                password = passwordEdt.getText().toString();
//
////                登录交互
//                KJHttp kjHttp = new KJHttp();
//                HttpParams httpParams = new HttpParams();
//                HttpConfig httpConfig = new HttpConfig();
//                httpConfig.cacheTime = 0;
//
//                httpParams.put("name",stdnum);
//                httpParams.put("pass",password);



//                kjHttp.get("http://104.194.78.111/tp/public/index.php/index/Login/login", httpParams, new HttpCallBack() {
//                    @Override
////                JSON解析
//                    public void onSuccess(String t) {
//                        super.onSuccess(t);
//                        JSONObject jsonObject = null;
//                        try {
//                            jsonObject = new JSONObject(t);
//                            state = jsonObject.get("state").toString();
////                            JSONObject state = jsonObject.getJSONObject(t);
//                        } catch (JSONException e) {
//                            e.printStackTrace();
//                        }
//                        if (state.equals("true")){
//                            Intent intent = new Intent(MainActivity.this,SchoolActivity.class);
//                            startActivity(intent);
//
//                        }else{
//                            new AlertDialog.Builder(MainActivity.this)
//                                    .setTitle("提示")
//                                    .setMessage("用户名或密码错误")
//                                    .setPositiveButton("好的", null)
//                                    .show();
//
//                        }
////                        Toast.makeText(MainActivity.this,state.toString(),Toast.LENGTH_LONG).show();
////
//                    }
//                    @Override
//                    public void onFailure(int errorNo , String strMsg){
//                        super.onFailure(errorNo,strMsg);
//                        Toast.makeText(MainActivity.this, "未知错误", Toast.LENGTH_SHORT).show();
//                    }
//                });
            }
        });
    }
}

package com.ooo.deemo.mybroadcastgo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button bt_go1;
    private Button bt_go2;
    private Button bt_go3;
    private Button bt_done;

    private TextView tv_show;
    private TextView tv_show2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();


    }

//注册组件
    private void initView() {

        bt_go1 = findViewById(R.id.bt_go1);
        tv_show = findViewById(R.id.tv_show);
        bt_go2 = findViewById(R.id.bt_go2);
        tv_show2 = findViewById(R.id.tv_show2);
        bt_go3 = findViewById(R.id.bt_go3);
        bt_done = findViewById(R.id.bt_done);

        bt_go1.setOnClickListener(this);
        bt_go2.setOnClickListener(this);

        bt_go3.setOnClickListener(this);
        bt_done.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_go1:
                //发送指定广播ACTION1
                Intent intent = new Intent("com.ACTION1");
                sendBroadcast(intent);

                break;


            case R.id.bt_go2:
                //发送指定广播ACTION2
                final Intent intent2 = new Intent("com.ACTION2");
                sendBroadcast(intent2);

                break;


            case R.id.bt_go3:
                //发送指定广播ACTION3
                final Intent intent3 = new Intent("com.ACTION3");
                sendBroadcast(intent3);

                break;


            case R.id.bt_done:

                MyReceiver myReceiver = new MyReceiver();
                tv_show2.setText(myReceiver.getStr());    //      调用getStr方法获取特定广播信息，并将广播信息展示在textView上

                break;


            default:
                break;
        }
    }
}

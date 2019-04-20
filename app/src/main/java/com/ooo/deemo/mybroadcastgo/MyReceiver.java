package com.ooo.deemo.mybroadcastgo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class MyReceiver extends BroadcastReceiver {


    static String ss = "";


    public MyReceiver() {

    }


    @Override
    public void onReceive(Context context, Intent intent) {

        ss = "I'm outside";

        Toast.makeText(context, "onReceive", Toast.LENGTH_SHORT).show();
        String action = intent.getAction();

        if (action.equals("com.ACTION1")) {
            ss = "I'm inside ACTION1";


        } else if (action.equals("com.ACTION2")) {

            ss = "I'm inside ACTION2";



        } else {
                                //由于在AndroidManifest中静态注册了com.ACTION3,所以该广播会被接收并在这里处理
            ss = "I'm inside else(by now , i'm inside ACTION3)";

        }

    }

    //提供一个方法返回处理信息

    public static String getStr() {
        return ss;
    }



}

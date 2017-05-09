package com.example.wangwei.android_intent_01;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

/**
 * Created by wangwei on 2017/5/9.
 */

public class OtherActivity extends Activity {
    private TextView textView;
    private TextView textView1;
    //传递静态变量必须申明public属性
    public static String name1;
    public static String address1;
    public static int age1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.other);//加载布局文件
        Intent intent = getIntent();
        textView=(TextView)findViewById(R.id.msg);
        textView1=(TextView)findViewById(R.id.msg1);
        int age = intent.getIntExtra("age",0);
        String name=intent.getStringExtra("name");
        String address = intent.getStringExtra("address");
        textView.setText("age-->"+age+"\n"+"name"+name+"\n"+"address"+address);
        textView1.setText("age-->"+age1+"\n"+"name"+name1+"\n"+"address"+address1);

    }
}


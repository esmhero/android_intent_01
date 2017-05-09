package com.example.wangwei.android_intent_01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//加载布局文件
        button =(Button)findViewById(R.id.button);
        button1=(Button)findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,OtherActivity.class);
                //在意图中传递数据
                intent.putExtra("name","张三");
                intent.putExtra("age",23);
                intent.putExtra("address","北京");
                //启动意图
                startActivity(intent);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //申明一个意图
                Intent intent=new Intent();
                intent.setClass(MainActivity.this,OtherActivity.class);
                OtherActivity.address1="南通";
                OtherActivity.age1=23;
                OtherActivity.name1="王伟";
                startActivity(intent);

            }
        });

    }
}

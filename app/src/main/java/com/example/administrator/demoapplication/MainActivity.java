package com.example.administrator.demoapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /**
     * 理解：
     * 1、singlTOP：如果此类activity在栈顶，想要开启相同的activity时不会创建新的activity，
     * 而是会调用onNewIntent方法（这可能就是复用栈顶这个activity）
     * 2、singlTask：如果activity不存在，就新建，
     * 如果存在就会干掉那个activity之上的所以activity再调用onNewIntent方法复用
     * 3、singlInstance：会单独拥有一个栈，不允许分享。
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.text_a);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SinglTopActivity.class);
                startActivity(intent);
            }
        });
        TextView textView1 = (TextView) findViewById(R.id.text_a1);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SinglTaskActivity.class);
                startActivity(intent);
            }
        });
        TextView textView2 = (TextView) findViewById(R.id.text_a2);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SinglinstanceActivity.class);
                startActivity(intent);
            }
        });
    }
}

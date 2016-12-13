package com.example.administrator.demoapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/12/8.
 */

public class SinglTopActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singltop);
        TextView textView = (TextView) findViewById(R.id.text_b);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SinglTopActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        TextView textView1 = (TextView) findViewById(R.id.text_b3);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SinglTopActivity.this, SinglTopActivity.class);
                startActivity(intent);
            }
        });
        TextView textView2 = (TextView) findViewById(R.id.text_b2);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SinglTopActivity.this, SinglinstanceActivity.class);
                startActivity(intent);
            }
        });
    }
}

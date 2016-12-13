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

public class SinglinstanceActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singlinstance);
        TextView textView = (TextView) findViewById(R.id.text_d);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SinglinstanceActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        TextView textView1 = (TextView) findViewById(R.id.text_d2);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SinglinstanceActivity.this, SinglTaskActivity.class);
                startActivity(intent);
            }
        });
    }
}

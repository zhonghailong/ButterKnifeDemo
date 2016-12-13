package com.example.administrator.demoapplication.butterknife;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.example.administrator.demoapplication.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by Administrator on 2016/12/13.
 */

public class ButterKnifeDemoActivity extends AppCompatActivity {
    @BindView(R.id.text)
    TextView textView;
    @BindView(R.id.button)
    Button button;
    private Unbinder unbinder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.butterknife_demo);
        unbinder = ButterKnife.bind(this);

        
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }
}

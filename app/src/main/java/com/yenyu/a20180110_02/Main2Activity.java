package com.yenyu.a20180110_02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv= findViewById(R.id.textView);
        Intent it = getIntent();
        Bundle b = it.getExtras();
        String str = b.getString("data");
        tv.setText(str);

    }



}

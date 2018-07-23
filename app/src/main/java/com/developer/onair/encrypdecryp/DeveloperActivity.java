package com.developer.onair.encrypdecryp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DeveloperActivity extends AppCompatActivity {

    private ImageView dev_pic;
    private TextView dev_name,dev_fb,dev_email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer);


        dev_pic = (ImageView) findViewById(com.developer.onair.encrypdecryp.R.id.dev_pic);
        dev_name = (TextView) findViewById(R.id.dev_name);
        dev_fb = (TextView) findViewById(com.developer.onair.encrypdecryp.R.id.dev_fb);
        dev_email = (TextView) findViewById(R.id.dev_email);

    }
}

package com.example.testing;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Html;
import android.transition.Scene;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

import info.hoang8f.widget.FButton;

import static android.os.SystemClock.sleep;
import static android.transition.Scene.getSceneForLayout;

public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen);

//        final ImageView home;
//        home = findViewById(R.id.path_160);
//        home.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                sleep(3000);
//                setContentView(R.layout.home_screen___1);
//            }
//        });

        new Thread(new Runnable() {
            public void run() {
                sleep(3000);
                setContentView(R.layout.home_screen___1);
            }
        }).start();

//        String styledText = "Stop.<br>that.<br> <font color='#FF7F50'>fire</font>";
//        TextView text = (TextView)findViewById(R.id.textView2);
//        text.setText(Html.fromHtml(styledText), TextView.BufferType.SPANNABLE);
    }
}
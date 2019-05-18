package com.example.lab2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start();
    }

    public void start()
    {
        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                if(!isChangingConfigurations())
                {
                    startActivity(new Intent(MainActivity.this, SecondActivity.class));
                    finish();
                }
            }
        }, 3000);
    }
}
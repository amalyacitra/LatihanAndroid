package com.chii.latihanchii;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void kalodiklik(View view) {

        TextView textView = (TextView) findViewById(R.id.welcome);

        textView.setText("ini Klo pake method implement dari xml onclick");


    }
}

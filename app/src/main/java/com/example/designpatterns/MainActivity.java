package com.example.designpatterns;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.designpatterns.builder.Demo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        //abstract factory pattern
//        Application application = Demo.configApplication();
//        application.paint();

        //builder pattern
        Demo.runBuilder();
    }


}
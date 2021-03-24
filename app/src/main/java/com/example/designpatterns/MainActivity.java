package com.example.designpatterns;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.designpatterns.abstractfactory.Demo;
import com.example.designpatterns.abstractfactory.app.Application;
import com.example.designpatterns.abstractfactory.factories.GUIFactory;
import com.example.designpatterns.abstractfactory.factories.MacOSFactory;
import com.example.designpatterns.abstractfactory.factories.WindowsFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        Application application = Demo.configApplication();
        application.paint();
    }


}
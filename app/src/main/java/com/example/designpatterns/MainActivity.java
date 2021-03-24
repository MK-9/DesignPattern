package com.example.designpatterns;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.designpatterns.app.Application;
import com.example.designpatterns.factories.GUIFactory;
import com.example.designpatterns.factories.MacOSFactory;
import com.example.designpatterns.factories.WindowsFactory;
import com.example.designpatterns.ui.main.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow();
        }

        Application application = configApplication();
        application.paint();

    }

    private static Application configApplication() {
        Application application;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("Mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        application = new Application(factory);
        return application;
    }
}
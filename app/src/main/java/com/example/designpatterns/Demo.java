package com.example.designpatterns;

import com.example.designpatterns.app.Application;
import com.example.designpatterns.factories.GUIFactory;
import com.example.designpatterns.factories.MacOSFactory;
import com.example.designpatterns.factories.WindowsFactory;

public class Demo {

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

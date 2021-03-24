package com.example.designpatterns.abstractfactory;

import com.example.designpatterns.abstractfactory.app.Application;
import com.example.designpatterns.abstractfactory.factories.GUIFactory;
import com.example.designpatterns.abstractfactory.factories.MacOSFactory;
import com.example.designpatterns.abstractfactory.factories.WindowsFactory;

public class Demo {

    public static Application configApplication() {
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

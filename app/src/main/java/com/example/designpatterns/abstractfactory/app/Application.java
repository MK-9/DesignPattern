package com.example.designpatterns.abstractfactory.app;

import com.example.designpatterns.abstractfactory.buttons.Button;
import com.example.designpatterns.abstractfactory.checkboxes.CheckBox;
import com.example.designpatterns.abstractfactory.factories.GUIFactory;

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */
public class Application {
    private final Button button;
    private final CheckBox checkBox;

    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkBox = factory.createCheckBox();
    }

    public void paint() {
        button.paint();
        checkBox.paint();
    }
}

package com.example.designpatterns.abstractfactory.factories;

import com.example.designpatterns.abstractfactory.buttons.Button;
import com.example.designpatterns.abstractfactory.buttons.MacOsButton;
import com.example.designpatterns.abstractfactory.checkboxes.CheckBox;
import com.example.designpatterns.abstractfactory.checkboxes.MacOsCheckBox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacOsCheckBox();
    }
}

package com.example.designpatterns.factories;

import com.example.designpatterns.buttons.Button;
import com.example.designpatterns.buttons.MacOsButton;
import com.example.designpatterns.checkboxes.CheckBox;
import com.example.designpatterns.checkboxes.MacOsCheckBox;

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

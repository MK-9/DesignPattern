package com.example.designpatterns.abstractfactory.factories;

import com.example.designpatterns.abstractfactory.buttons.Button;
import com.example.designpatterns.abstractfactory.buttons.WindowsButton;
import com.example.designpatterns.abstractfactory.checkboxes.CheckBox;
import com.example.designpatterns.abstractfactory.checkboxes.WindowsCheckBox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}

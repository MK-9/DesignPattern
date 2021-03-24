package com.example.designpatterns.factories;

import com.example.designpatterns.buttons.Button;
import com.example.designpatterns.buttons.WindowsButton;
import com.example.designpatterns.checkboxes.CheckBox;
import com.example.designpatterns.checkboxes.MacOsCheckBox;
import com.example.designpatterns.checkboxes.WindowsCheckBox;

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

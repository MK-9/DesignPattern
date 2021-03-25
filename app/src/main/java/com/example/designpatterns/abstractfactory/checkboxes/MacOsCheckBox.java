package com.example.designpatterns.abstractfactory.checkboxes;

public class MacOsCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox.");
    }
}

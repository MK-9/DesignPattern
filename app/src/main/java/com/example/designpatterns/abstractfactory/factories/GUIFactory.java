package com.example.designpatterns.abstractfactory.factories;

import com.example.designpatterns.abstractfactory.buttons.Button;
import com.example.designpatterns.abstractfactory.checkboxes.CheckBox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();

    CheckBox createCheckBox();
}

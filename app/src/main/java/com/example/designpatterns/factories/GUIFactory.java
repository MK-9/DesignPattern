package com.example.designpatterns.factories;

import com.example.designpatterns.buttons.Button;
import com.example.designpatterns.checkboxes.CheckBox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();

    CheckBox createCheckBox();
}

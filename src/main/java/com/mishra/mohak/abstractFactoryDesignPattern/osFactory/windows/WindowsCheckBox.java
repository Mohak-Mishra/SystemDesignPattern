package com.mishra.mohak.abstractFactoryDesignPattern.osFactory.windows;

import com.mishra.mohak.abstractFactoryDesignPattern.uiFactory.CheckBox;

public class WindowsCheckBox implements CheckBox {
    public void paint() {
        System.out.println("Painting Windows CheckBox");
    }
}

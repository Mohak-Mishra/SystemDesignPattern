package com.mishra.mohak.abstractFactoryDesignPattern.osFactory.mac;

import com.mishra.mohak.abstractFactoryDesignPattern.uiFactory.CheckBox;

public class MacCheckBox implements CheckBox {
    public void paint() {
        System.out.println("Painting Mac CheckBox");
    }
}

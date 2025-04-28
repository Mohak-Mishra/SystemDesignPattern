package com.mishra.mohak.abstractFactoryDesignPattern.uiFactory;

import com.mishra.mohak.abstractFactoryDesignPattern.osFactory.mac.MacButtons;
import com.mishra.mohak.abstractFactoryDesignPattern.osFactory.mac.MacCheckBox;

public class MacUiFactory implements UiFactory {
    @Override
    public Button createButton() {
        return new MacButtons();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}

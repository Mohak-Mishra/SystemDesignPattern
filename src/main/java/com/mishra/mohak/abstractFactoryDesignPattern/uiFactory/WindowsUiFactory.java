package com.mishra.mohak.abstractFactoryDesignPattern.uiFactory;

import com.mishra.mohak.abstractFactoryDesignPattern.osFactory.windows.WindowsButtons;
import com.mishra.mohak.abstractFactoryDesignPattern.osFactory.windows.WindowsCheckBox;

public class WindowsUiFactory implements UiFactory {
    @Override
    public Button createButton() {
        return new WindowsButtons();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}

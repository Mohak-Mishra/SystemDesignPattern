package com.mishra.mohak.abstractFactoryDesignPattern.uiFactory;

public class Application {
    private Button button;
    private CheckBox checkBox;
    public  Application(UiFactory uiFactory) {
     button= uiFactory.createButton();
     checkBox = uiFactory.createCheckBox();
    }
    public void display() {
        button.position();
        checkBox.paint();
    }
}

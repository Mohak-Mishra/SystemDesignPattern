package com.mishra.mohak.abstractFactoryDesignPattern.osFactory.windows;

import com.mishra.mohak.abstractFactoryDesignPattern.uiFactory.Button;

public class WindowsButtons implements Button {
    public void position() {
        System.out.println("windows button position");
    }
}

package com.mishra.mohak.abstractFactoryDesignPattern.osFactory.mac;

import com.mishra.mohak.abstractFactoryDesignPattern.uiFactory.Button;

public class MacButtons implements Button {
    @Override
    public void position() {
        System.out.println("mac button position");
    }
}

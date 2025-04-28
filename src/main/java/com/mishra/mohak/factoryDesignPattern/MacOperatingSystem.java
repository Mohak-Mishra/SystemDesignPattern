package com.mishra.mohak.factoryDesignPattern;

public class MacOperatingSystem extends OperatingSystem {
    public MacOperatingSystem(String osVersion, String osArchitecture) {
        super(
                osVersion
                , osArchitecture
        );
    }

    @Override
    public void changeDir(String dir) {
        System.out.println("Changing Mac Operating System directory: " + dir);
    }

    @Override
    public void removeDir(String dir) {
        System.out.println("Removing Mac Operating System directory: " + dir);
    }
}

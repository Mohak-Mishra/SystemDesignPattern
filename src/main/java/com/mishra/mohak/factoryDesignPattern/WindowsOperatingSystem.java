package com.mishra.mohak.factoryDesignPattern;

public class WindowsOperatingSystem extends OperatingSystem {
    public WindowsOperatingSystem(String osVersion, String osArchitecture) {
        super(
                osVersion,osArchitecture
        );
    }

    @Override
    public void changeDir(String dir) {
        System.out.println("Changing Windows Operating System directory: " + dir);
    }

    @Override
    public void removeDir(String dir) {
        System.out.println("Removing Windows Operating System directory: " + dir);
    }
}

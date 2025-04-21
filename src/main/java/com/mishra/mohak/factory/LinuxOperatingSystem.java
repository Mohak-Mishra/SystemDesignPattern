package com.mishra.mohak.factory;

public class LinuxOperatingSystem extends OperatingSystem {
    public LinuxOperatingSystem(String osVersion, String osArchitecture) {
        super(
                osVersion,osArchitecture
        );
    }

    @Override
    public void changeDir(String dir) {
        System.out.println("Changing Linux Operating System directory: " + dir);
    }

    @Override
    public void removeDir(String dir) {
        System.out.println("Removing Linux Operating System directory: " + dir);
    }
}

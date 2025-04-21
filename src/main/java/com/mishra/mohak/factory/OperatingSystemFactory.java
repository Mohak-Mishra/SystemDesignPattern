package com.mishra.mohak.factory;

import java.awt.*;

public class OperatingSystemFactory {
    private OperatingSystemFactory() {

    }
    public static OperatingSystem getInstance(String osName,String osVersion, String osArchitecture) {
        if(osName.equalsIgnoreCase("linux")) {
            return new LinuxOperatingSystem(osVersion,osArchitecture);
        }
        if(osName.equalsIgnoreCase("windows")||osName.equalsIgnoreCase("window")) {
            return new WindowsOperatingSystem(osVersion,osArchitecture);
        }
        if(osName.equalsIgnoreCase("mac")||osName.equalsIgnoreCase("macos")) {
            return new MacOperatingSystem(osVersion,osArchitecture);
        }
        else {
            throw new IllegalArgumentException("Unsupported operating system: " + osName);
        }
    }
}

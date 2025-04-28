package com.mishra.mohak.factoryDesignPattern;

import lombok.*;

@ToString
@Getter
@Setter
@AllArgsConstructor
public abstract class OperatingSystem {
    private String osVersion;
    private String osArchitecture;

    public abstract void changeDir(String dir);
    public abstract void removeDir(String dir);

}

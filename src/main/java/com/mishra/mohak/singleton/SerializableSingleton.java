package com.mishra.mohak.singleton;

import java.io.Serial;
import java.io.Serializable;

public class SerializableSingleton implements Serializable {
    private static SerializableSingleton instance;
    private SerializableSingleton() {}
    public static SerializableSingleton getInstance() {
        if (instance == null) {
            synchronized (SerializableSingleton.class) {
                if (instance == null) {
                    instance = new SerializableSingleton();
                }
            }
        }
        return instance;
    }
    @Serial
    protected Object readResolve() {
        return instance;
    }
}

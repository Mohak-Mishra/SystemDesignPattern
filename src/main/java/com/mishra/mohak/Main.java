package com.mishra.mohak;

import com.mishra.mohak.factory.OperatingSystem;
import com.mishra.mohak.factory.OperatingSystemFactory;
import com.mishra.mohak.singleton.LazySingleton;
import com.mishra.mohak.singleton.SerializableSingleton;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        SerializableSingleton singleton = SerializableSingleton.getInstance();
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton.obj"));
//        oos.writeObject(singleton);
//        oos.flush();
//        oos.close();
//        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("singleton.obj"));
//        SerializableSingleton singleton1=(SerializableSingleton) ois.readObject();
//        System.out.println(singleton1.hashCode()+"  "+singleton.hashCode());

        OperatingSystem macos=OperatingSystemFactory.getInstance("macos","sequioa15.5","64bit");
        OperatingSystem windows=OperatingSystemFactory.getInstance("windows","windows 11","32bit");
        OperatingSystem linux=OperatingSystemFactory.getInstance("linux","ubuntu","64bit");
        System.out.println(macos+" "+windows+" "+linux);
    }
}
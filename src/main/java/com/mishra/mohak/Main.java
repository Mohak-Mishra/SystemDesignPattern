package com.mishra.mohak;

import com.mishra.mohak.DependencyInjectionDesignPattern.EmailProvider;
import com.mishra.mohak.DependencyInjectionDesignPattern.NotificationService;
import com.mishra.mohak.DependencyInjectionDesignPattern.SmsProvider;
import com.mishra.mohak.adapterDesignPattern.*;
import com.mishra.mohak.prototypeDesignPattern.VehicleRegistry;
import com.mishra.mohak.templateDesignPattern.Cricket;
import com.mishra.mohak.templateDesignPattern.Football;
import com.mishra.mohak.templateDesignPattern.Game;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, CloneNotSupportedException {

        // Singleton pattern
//        SerializableSingleton singleton = SerializableSingleton.getInstance();
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton.obj"));
//        oos.writeObject(singleton);
//        oos.flush();
//        oos.close();
//        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("singleton.obj"));
//        SerializableSingleton singleton1=(SerializableSingleton) ois.readObject();
//        System.out.println(singleton1.hashCode()+"  "+singleton.hashCode());

        // Factory design pattern
//        OperatingSystem macos=OperatingSystemFactory.getInstance("macos","sequioa15.5","64bit");
//        OperatingSystem windows=OperatingSystemFactory.getInstance("windows","windows 11","32bit");
//        OperatingSystem linux=OperatingSystemFactory.getInstance("linux","ubuntu","64bit");
//        System.out.println(macos+" "+windows+" "+linux);

        // abstract Factory design pattern
//          Application app = new Application(new MacUiFactory());
//          app.display();
//          Application app2 = new Application(new WindowsUiFactory());
//          app2.display();

        // Builder design pattern
//            Burger burger = new Burger.BurgerBuilder()
//                    .cheese(true)
//                    .lettuce(false)
//                    .mayo(true)
//                    .size("Large")
//                    .tomatoes(false)
//                    .build();
//            House house =House.builder()
//                    .rooms(5)
//                    .parking(3)
//                    .swimmingPool(true)
//                    .restRooms(6)
//                    .windows(12)
//                    .build();
//        System.out.println(house);

        // Prototype design pattern
//        System.out.println(VehicleRegistry.getVehicle("two"));
//        System.out.println(VehicleRegistry.getVehicle("four"));

        // Adapter design pattern
//        SwiggyStore ss=new SwiggyStore();
//        ss.addItem(new FoodItem());
//        ss.addItem(new FoodItem());
//        ss.addItem(new GroceryItemAdapter(new GroceryProduct()));
//        System.out.println(ss.items.get(0).getRestaurantName());
//        System.out.println(ss.items.get(2).getRestaurantName());

        // Template design pattern
//        Game cricket=new Cricket();
//        Game football=new Football();
//        cricket.play();
//
//        football.play();
        // DependencyInjection design pattern
        NotificationService emailService = new NotificationService(new EmailProvider());
        NotificationService smsService=new NotificationService(new SmsProvider());
        emailService.sendNotification("this is a test","John Doe");
        smsService.sendNotification("this is a test","John Doe");
    }
}
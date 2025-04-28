package com.mishra.mohak.DependencyInjectionDesignPattern;

public class EmailProvider implements NotificationProvider {

    @Override
    public void sendNotification(String message, String recipient) {
        System.out.println("email is sent to "+recipient+" with message "+message);
    }
}

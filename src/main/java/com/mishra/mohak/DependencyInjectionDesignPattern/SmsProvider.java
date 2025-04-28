package com.mishra.mohak.DependencyInjectionDesignPattern;

public class SmsProvider implements NotificationProvider {
    @Override
    public void sendNotification(String message, String recipient) {
        System.out.println("sms is sent to "+recipient+" with message "+message);
    }
}

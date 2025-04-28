package com.mishra.mohak.DependencyInjectionDesignPattern;

import javax.management.Notification;

public class NotificationService {
    private NotificationProvider notificationProvider;
    public NotificationService(NotificationProvider notificationProvider) {
        this.notificationProvider = notificationProvider;
    }
    public void sendNotification(String recipient, String message) {
        notificationProvider.sendNotification(recipient, message);
    }
}

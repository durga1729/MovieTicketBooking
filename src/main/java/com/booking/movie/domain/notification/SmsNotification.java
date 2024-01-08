package com.booking.movie.domain.notification;

public class SmsNotification extends Notification{
    @Override
    public boolean sendNotification() {
        return false;
    }
}

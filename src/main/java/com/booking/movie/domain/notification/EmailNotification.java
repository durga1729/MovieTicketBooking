package com.booking.movie.domain.notification;

public class EmailNotification extends Notification{
    @Override
    public boolean sendNotification() {
        return false;
    }
}

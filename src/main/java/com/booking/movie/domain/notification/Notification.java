package com.booking.movie.domain.notification;

import java.util.Date;

public abstract class Notification {
    int notificationId;
    Date createdOn;
    String content;
    public abstract boolean sendNotification();
}

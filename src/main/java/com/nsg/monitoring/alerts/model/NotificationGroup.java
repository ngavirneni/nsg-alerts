package com.nsg.monitoring.alerts.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class NotificationGroup {

    private String id;
    private String name;
    private List<NotificationChannel> notificationChannels;
}

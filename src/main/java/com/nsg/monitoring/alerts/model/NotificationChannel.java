package com.nsg.monitoring.alerts.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class NotificationChannel {

    private String id;
    private List<Device> devices;
    private String groupId;
    private String scheduleStart;
    private String scheduleEnd;
}

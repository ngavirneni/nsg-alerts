package com.nsg.monitoring.alerts.model;

import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;

@Getter
@Setter
public class Notification {

    private Alert alert;
    private Device device;
    private String message;
    private ZonedDateTime createTime;


}

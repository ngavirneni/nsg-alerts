package com.nsg.monitoring.alerts.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.annotation.Id;

import java.time.ZonedDateTime;

@Slf4j
@Getter
@Setter
@Data
public class Alert {

    @Id
    private String id;
    private String name;
    private String type;
    private String templateId;
    private String text;
    private ZonedDateTime createTime;
    private String createdBy;
    private ZonedDateTime updateTime;
    private ZonedDateTime termedTime;
    private String updatedBy;
    private String componentId;
    private String notificationGroupId;
}

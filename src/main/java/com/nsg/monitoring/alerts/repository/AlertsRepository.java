package com.nsg.monitoring.alerts.repository;

import com.nsg.monitoring.alerts.model.Alert;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "alert", path="alert")
public interface AlertsRepository extends MongoRepository<Alert, String> {

    Alert findByComponentId(@Param("id") String id) ;

}

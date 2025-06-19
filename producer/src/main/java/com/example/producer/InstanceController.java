package com.example.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InstanceController {

    @Value("${server.port}")
    private String port;

    private final String instanceId = java.util.UUID.randomUUID().toString();

    @GetMapping("/instance-info")
    public String getInstancesInfo(){
        System.out.println("Request Received at instance running port: "+ port);
        return "Instance server by Port: " +port+ ". Instance ID: "+ instanceId;
    }
}

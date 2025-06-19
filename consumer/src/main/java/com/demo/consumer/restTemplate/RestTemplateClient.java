package com.demo.consumer.restTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestTemplateClient {

    private static final String PROVIDER_URl = "http://localhost:9091";

    @Autowired
    RestTemplate  restTemplate;

    public String getInstanceInfo(){
            return restTemplate.getForObject(PROVIDER_URl+"/instance-info",String.class) ;
    }
}

package com.demo.consumer.restTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/rest-template")
public class RestTemplateController {

    @Autowired
    RestTemplateClient restTemplateClient;

    @GetMapping("/instance")
    public String getInstance(){
//        RestTemplate restTemplate = new RestTemplate();
//       String response= restTemplate.getForObject("http://localhost:9091/instance-info",
//                String.class);
//        return response;
      String response =  restTemplateClient.getInstanceInfo();
      return response;
    }
}

package com.demo.consumer.restClient;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@RestController
@RequestMapping("/api/rest-client")
@RequiredArgsConstructor
public class RestClientController {

    private final ProviderRestClient restClientConfig;

    @GetMapping("/instance")
    public String getInstance(){
//        RestClient restClient= RestClient.create();
//     String response=   restClient.get()
//                .uri("http://localhost:9091/instance-info")
//                .retrieve()
//                .body(String.class);

        return restClientConfig.getInstance();
    }
}

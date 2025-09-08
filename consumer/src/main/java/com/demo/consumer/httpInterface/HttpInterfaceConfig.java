package com.demo.consumer.httpInterface;

import io.netty.handler.proxy.HttpProxyHandler;
import jakarta.servlet.http.Part;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.client.support.RestTemplateAdapter;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;
import org.springframework.web.util.DefaultUriBuilderFactory;

@Configuration
public class HttpInterfaceConfig {


//    @Bean
//    public ProviderHttpInterface webClientInterface(){
//        WebClient webClient = WebClient
//                .builder()
//                .baseUrl("http://localhost:9091")
//                .build();
//
//        WebClientAdapter webClientAdapter = WebClientAdapter.create(webClient);
//        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(webClientAdapter).build();
//
//        ProviderHttpInterface service = factory.createClient(ProviderHttpInterface.class);
//
//        return service;
//    }

//    @Bean
//    public ProviderHttpInterface restClientInterface(){
//        RestClient restClient = RestClient
//                .builder()
//                .baseUrl("http://localhost:9091")
//                .build();
//
//        RestClientAdapter restClientAdapter = RestClientAdapter.create(restClient);
//        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(restClientAdapter).build();
//
//        ProviderHttpInterface service = factory.createClient(ProviderHttpInterface.class);
//
//        return service;
//    }



    @Bean
    public ProviderHttpInterface restTemplateInterface(){
        RestTemplate restTemplate = new RestTemplate();
               restTemplate.setUriTemplateHandler(new DefaultUriBuilderFactory("http://localhost:9091"));

        RestTemplateAdapter restTemplateAdapter = RestTemplateAdapter.create(restTemplate);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(restTemplateAdapter).build();

        ProviderHttpInterface service = factory.createClient(ProviderHttpInterface.class);

        return service;
    }
}

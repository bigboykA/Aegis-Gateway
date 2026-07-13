package com.aegis.gateway.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class RoutingService {
    
    private final RestClient restClient;

    public RoutingService(RestClient restClient){
        this.restClient = restClient;
    }


    public String forwardHello(){
        return restClient.get()
                .uri("http://localhost:8081/hello")
                .retrieve()
                .body(String.class);
    }
}

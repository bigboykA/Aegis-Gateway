package com.aegis.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@RestController
public class GatewayController {
    private final RestClient restClient;

    public GatewayController(RestClient restClient){
        this.restClient = restClient;
    }

    
    @GetMapping("/hello")
    public String hello(){
        return restClient.get()
                .uri("http://localhost:8081/hello")
                .retrieve()
                .body(String.class);
    
    }


}

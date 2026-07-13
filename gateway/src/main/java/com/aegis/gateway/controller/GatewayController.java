package com.aegis.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import com.aegis.gateway.service.RoutingService;

@RestController
public class GatewayController {
    private final RoutingService routingService;

    public GatewayController(RoutingService routingService){
       this.routingService = routingService;
    }
    @GetMapping("/hello")
    public String hello(){
        return routingService.forwardHello();
    
    }


}

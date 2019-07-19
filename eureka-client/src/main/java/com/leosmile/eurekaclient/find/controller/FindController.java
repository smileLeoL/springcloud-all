package com.leosmile.eurekaclient.find.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FindController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/find")
    public String find(){
        String service = "serviceName:"+discoveryClient.getServices().get(0)+";size:"+discoveryClient.getServices().size();
        return service;
    }
}

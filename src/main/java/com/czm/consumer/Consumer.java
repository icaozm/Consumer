package com.czm.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author: caozm
 * @create: 2023-03-02 22:24
 * @Version 1.0
 * @description:
 **/
@RestController
public class Consumer {

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/echo")
    public String echo() {
        return restTemplate.getForObject("http://provider/hello/t",String.class);
    }


}
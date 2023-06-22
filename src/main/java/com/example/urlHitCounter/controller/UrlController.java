package com.example.urlHitCounter.controller;

import com.example.urlHitCounter.model.UrlCounter;
import com.example.urlHitCounter.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/visitor-count-app")
public class UrlController {
    @Autowired
    UrlService urlService;
    @GetMapping(value = "/count")
    public UrlCounter getCounter(@RequestParam String name){
        return urlService.getCounterFromService(name);

    }
}

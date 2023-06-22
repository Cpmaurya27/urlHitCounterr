package com.example.urlHitCounter.service;

import com.example.urlHitCounter.model.UrlCounter;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class UrlService {
    HashMap<String, Integer> storeCounter = new HashMap<>();
    public UrlCounter getCounterFromService(String name){
        int count = storeCounter.put(name, storeCounter.getOrDefault(name, 0) + 1);
        UrlCounter res = new UrlCounter(name, count++);
        return res;
    }
}

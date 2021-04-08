package com.example.hotwaptest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TEstController {

    @Autowired
    private testService testService;


    @GetMapping("/test")
    public String test() {
        return testService.save();
    }

}

package com.example.wshop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {

    @GetMapping(value = "/_/health")
    public boolean health(){
        return true;
    }
}

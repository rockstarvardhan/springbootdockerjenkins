package com.neoteric.springbootdockerdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerDemo {
    @GetMapping(value = "api/hello",produces = "application/json",consumes = "application/json")
    public String getStatus(){
        System.out.println("hello world");
        System.out.println("helloworld ");
        return "";
    }

}

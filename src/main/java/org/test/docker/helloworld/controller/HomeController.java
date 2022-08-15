package org.test.docker.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class HomeController {

    @GetMapping("/home")
    public String home() {
        log.info("------------------------------ home ------------------------------");
        return "Welcome to Spring Boot Rest API Docker Image !!!";
    }
}

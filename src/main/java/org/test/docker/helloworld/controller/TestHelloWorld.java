package org.test.docker.helloworld.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/api/TestHelloWorld")
@RestController
public class TestHelloWorld {
    private static Logger logger = LoggerFactory.getLogger(TestHelloWorld.class);
    @GetMapping("/getMessage")
    @ResponseBody
    public String getMessage(){
        logger.info("--------------getMessage-----------------");
        return "Hello World Docker !!";
    }
    
}

package org.test.docker.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@RestController
@Slf4j
public class DockerSpringBootApplication {

	@GetMapping("/")
    public String applicationStatus() {
        log.info("---------------------applicationStatus-------------------");
        return "Application is up and running !";
    }

	@GetMapping("/{name}")
    public String welcome(@PathVariable String name) {
        log.info("name = " + name);
        log.info("---------------------welcome-------------------");

        return "Hi " + name + " Welcome to Spring Boot Rest API Docker Image !!";
    }
	
	
	public static void main(String[] args) {
		SpringApplication.run(DockerSpringBootApplication.class, args);
	}

}

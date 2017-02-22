package org.weweb.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wshen on 2017/1/5.
 */
@SpringBootApplication
@RestController
public class HelloWorld {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
    @RequestMapping("/")
    public String greeting() {
        return "greeting Hello World!";
    }
    public static void main(String[] args) {
        SpringApplication.run(HelloWorld.class, args);
    }
}
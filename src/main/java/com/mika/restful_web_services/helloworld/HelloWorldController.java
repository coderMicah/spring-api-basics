package com.mika.restful_web_services.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    // @RequestMapping(path = "/hello-world", method = RequestMethod.GET)
    @GetMapping(path = "/hello-world")
    public String hello() {
        return "Hello World";
    }

    @GetMapping(path  = "/hello-world-bean")
    public HelloWorldBean helloBean() {
        return new HelloWorldBean("Hello World");
    }
}

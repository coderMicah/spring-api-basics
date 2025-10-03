package com.mika.restful_web_services.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @GetMapping("/v1/person")
    public Person1 getPerson1() {
        return new Person1("Bob Charlotn");
    }

    @GetMapping("/v2/person")
    public Person2 getPerson2() {
        return new Person2(new Name("James", "Bond"));
    }
}

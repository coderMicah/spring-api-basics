package com.mika.restful_web_services.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @GetMapping("/v1/person")
    public Person1 getPerson1UrlVersioning() {
        return new Person1("Bob Charlotn");
    }

    @GetMapping("/v2/person")
    public Person2 getPerson2UrlVersioning() {
        return new Person2(new Name("James", "Bond"));
    }

    @GetMapping(path = "/person", params = "version=1")
    public Person1 getPerson1ParamVersioning() {
        return new Person1("Bob Charlotn");
    }

    @GetMapping(path = "/person", params = "version=2")
    public Person2 getPerson2ParamVersioning() {
        return new Person2(new Name("James", "Bond"));
    }

    @GetMapping(path = "/person", headers = "X-API-VERSION=1")
    public Person1 getPerson1RequestHeaderVersioning() {
        return new Person1("Bob Charlotn");
    }

    @GetMapping(path = "/person", headers = "X-API-VERSION=2")
    public Person2 getPerson2HeaderVersioning() {
        return new Person2(new Name("James", "Bond"));
    }
}

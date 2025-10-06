package com.mika.restful_web_services.filtering;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilteringController {

    @GetMapping(path = "/filtering")
    public SomeBean filtering() {
        return new SomeBean("field1", "field2", "field3");
    }

    @GetMapping(path = "/filtering-list")
    public List<SomeBean> filteringList() {
        return Arrays.asList(new SomeBean("field1", "field2", "field3"),
                new SomeBean("field4", "field5", "6"));
    }
}

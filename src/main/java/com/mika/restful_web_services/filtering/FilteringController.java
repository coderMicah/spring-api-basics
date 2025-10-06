package com.mika.restful_web_services.filtering;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class FilteringController {

    @GetMapping(path = "/filtering")
    public MappingJacksonValue filtering() {
        SomeBean someBean = new SomeBean("field1", "field2", "field3");
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(someBean);

        // filtering field 2 only
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field1", "field3");
        FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);
        mappingJacksonValue.setFilters(filters);

        return mappingJacksonValue;
    }

    @GetMapping(path = "/filtering-list")
    public MappingJacksonValue filteringList() {
        List<SomeBean> values = Arrays.asList(new SomeBean("field1", "field2", "field3"),
                new SomeBean("field4", "field5", "6"));

        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(values);

        // filtering field 1 only
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field2", "field3");
        FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);
        mappingJacksonValue.setFilters(filters);

        return mappingJacksonValue;

    }
}

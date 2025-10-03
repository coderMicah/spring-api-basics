package com.mika.restful_web_services.helloworld;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    private MessageSource messageSource;

    public HelloWorldController(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    // @RequestMapping(path = "/hello-world", method = RequestMethod.GET)
    @GetMapping(path = "/hello-world")
    public String hello() {
        return "Hello World";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloBean() {
        return new HelloWorldBean("Hello World");
    }

    @GetMapping(path = "/hello-world/{name}")
    public HelloWorldBean helloBeanPath(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello, %s", name));
    }

    @GetMapping(path = "/hello-world/i18n")
    public String helloWorldInternationalization() {
        Locale locale = LocaleContextHolder.getLocale();
        return messageSource.getMessage("good.morning.message", null, "Default Message", locale);

    }
}

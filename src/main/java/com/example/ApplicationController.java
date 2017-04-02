package com.example;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ApplicationController {

    private static final String template = "%s!";

    @RequestMapping("application")
    public Application application(@RequestParam(value="name", defaultValue="YAKS") String name) {
        return new Application(String.format(template, name));
    }
}

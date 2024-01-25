package com.temr1.Lesson2_3_maven.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SiteController {
    @GetMapping("/")
    public String index() {
        return "<a href='/mySite'>My Site</a>";
    }

    @GetMapping("/mySite")
    public String mySite() {
        return "Hello";
    }
}
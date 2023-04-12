package com.example.demoMySpringBooot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestParamController {
    @RequestMapping("/welcome_request_param")
    public String message(@RequestParam String name) {
        return "welcome to Spring boot " + name;

    }
    @RequestMapping("/verify_age_param")
    public String verifyAge(@RequestParam int    age) {
        if (age < 18) {
            return "person is child";
        } else if (age > 18 & age < 45) {
            return "person is Young";

        } else  {
            return "person is old";
        }
    }
        @RequestMapping("/verify_display_param")
    public String  display( @RequestParam String name, @RequestParam int age, @RequestParam String section){
        return "Student name is :" +name +"Age is :"+age +"section is :"+section;

    }
}

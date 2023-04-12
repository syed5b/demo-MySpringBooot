package com.example.demoMySpringBooot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathVariableControler {
    //@RequestMapping("endpoint_name/{pathvariable_name}")
    @RequestMapping("/Welcome_msg/{name}")
    public String message(@PathVariable String name) {
        //String msg="Welcome to spring boot " +name;
        return "welcome to Spring boot " + name;
    }
@RequestMapping("/verify_age/{age}")
    public String verifyAge(@PathVariable int    age) {
        if (age < 18) {
            return "person is child";
        } else if (age > 18 & age < 45) {
            return "person is Young";

        } else  {
            return "person is old";
        }
    }
    @RequestMapping("/display_info/{name}/{age}/{section}")
    public String  display( @PathVariable String name, @PathVariable int age, @PathVariable String section){
        return "Student name is :" +name +"Age is :"+age +"section is :"+section;

    }
}

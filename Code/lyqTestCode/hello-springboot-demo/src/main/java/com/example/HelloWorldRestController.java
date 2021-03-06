package com.example;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String greeting(){
        return "Hello SpringBoot learner!";
    }

    @RequestMapping(value = "/{UserName}", method = RequestMethod.GET)
    public String greeting(@PathVariable String UserName){
        return "Hello " + UserName;
    }
    
     @RequestMapping(value = "/", method = RequestMethod.GET)
    public String greeting(){
        return "Hello SpringBoot learner!";
    }
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String greeting(){
        return "Hello SpringBoot learner!";
    }
     @RequestMapping(value = "/", method = RequestMethod.GET)
    public String greeting(){
        return "Hello SpringBoot learner!";
    }
}

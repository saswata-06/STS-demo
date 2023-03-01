package com.example.demo;

//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/add")
public class HelloWorldController {

    @RequestMapping(value="", method=RequestMethod.GET)
    public String Initial()
    {
        return "You are in the initial class";
    }


    //Path Variable/URI Template Variable
    //http://localhost:8080/add/hello-world/Saswata
    @RequestMapping(value="/hello-world/{name}", method=RequestMethod.GET)
    public String helloworld(@PathVariable(value="name")String name)
        {
            return "Hello World "+name+"!";
        }

}
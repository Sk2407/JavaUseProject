package demoapi.javauseproject.controller;

import demoapi.javauseproject.entity.Developer;
import demoapi.javauseproject.service.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
   private ServiceInterface serviceInterface;
/*
    @GetMapping("/find")
    public String getValue(){
        return "hello sachin ";
    }
    */

    @GetMapping("/getdata")
    public List<Developer> getDeveloper(){
        return serviceInterface.getDeveloper();
    }
    @PostMapping("/insert")
    public Developer addData(@RequestBody Developer developer) {
        return serviceInterface.addData(developer);
    }

}

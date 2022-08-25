package demoapi.javauseproject.controller;

import demoapi.javauseproject.entity.Developer;
import demoapi.javauseproject.service.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MyController {

    @Autowired
   private ServiceInterface serviceInterface;

    @GetMapping("/name")
    public String getValue() {
        return "Hello sachin";
    }
    @GetMapping("/getdata")
    public List<Developer> getDeveloper(){
        return serviceInterface.getDeveloper();
    }
}

package demoapi.javauseproject.controller;


import demoapi.javauseproject.entity.Developer;
import demoapi.javauseproject.service.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.HashSet;
import java.util.List;
import java.util.Optional;

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
    @GetMapping("/getdata/{id}")
    public Optional<Developer> getInfoOfOneEmployee(@PathVariable int id){
        return serviceInterface.getInfoOfOneEmployee(id);
    }

    @GetMapping("/getdata")
    public List<Developer> getDeveloper(){
        return serviceInterface.getDeveloper();
    }
    @PostMapping("/insert")
    public HashSet<Developer> addData(@RequestBody Developer[] developer) {
        return (HashSet<Developer>)  serviceInterface.addData(developer);
    }
    @PutMapping("getupdate/{id}")
    public void updateEmployeeData(@RequestBody Developer developer){
         serviceInterface.updateEmployeeData(developer);
    }


}

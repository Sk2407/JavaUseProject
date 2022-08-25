package demoapi.javauseproject.service;


import demoapi.javauseproject.dao.Dao;
import demoapi.javauseproject.entity.Developer;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Service implements ServiceInterface {

    @Autowired
    private Dao var;
     public List<Developer> getDeveloper(){
           return  (List<Developer>) var.findAll();
    }

}

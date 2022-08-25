package demoapi.javauseproject.service;


import demoapi.javauseproject.dao.Dao;
import demoapi.javauseproject.entity.Developer;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class Service implements ServiceInterface {

    @Autowired
    private Dao var;

    @Override
    public List<Developer> getDeveloper() {
        return  (List<Developer>) var.findAll();
    }

    @Override
    public Developer addData(Developer developer) {
        return var.save(developer);
    }


}

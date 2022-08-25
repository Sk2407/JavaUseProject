package demoapi.javauseproject.service;


import demoapi.javauseproject.dao.Dao;
import demoapi.javauseproject.entity.Developer;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

@org.springframework.stereotype.Service
public class Service implements ServiceInterface {

    @Autowired
    private Dao var;

    @Override
    public List<Developer> getDeveloper() {
        return  (List<Developer>) var.findAll();
    }

    @Override
    public HashSet<Developer> addData(Developer[] developer) {
        ArrayList<Developer> obj=new ArrayList<Developer>();
        int x=developer.length;
        int i=0;
        while(i<x){
            obj.add(developer[i]);
            i++;
        }
        HashSet<Developer> d= new HashSet<Developer>(obj);
        HashSet<Developer> returnList=new HashSet<>();
        int j=0;
        while(j<x){
            var.save(developer[j]);
            returnList.add(developer[j]);
            j++;
        }
        return returnList;
    }

    @Override
    public Optional<Developer> getInfoOfOneEmployee(int id) {
          return var.findById(id);
    }

    @Override
    public void updateEmployeeData(Developer developer) {
              var.save(developer);
    }


}

package demoapi.javauseproject.service;

import demoapi.javauseproject.entity.Developer;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;

public interface ServiceInterface {

    List<Developer> getDeveloper();
    HashSet<Developer> addData(Developer[] developer);
    Optional<Developer> getInfoOfOneEmployee(int id);
    void updateEmployeeData( Developer developer);

}

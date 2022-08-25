package demoapi.javauseproject.service;

import demoapi.javauseproject.entity.Developer;

import java.util.HashSet;
import java.util.List;

public interface ServiceInterface {
    List<Developer> getDeveloper();
    HashSet<Developer> addData(Developer[] developer);
}

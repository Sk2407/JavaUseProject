package demoapi.javauseproject.service;

import demoapi.javauseproject.entity.Developer;

import java.util.List;

public interface ServiceInterface {
    List<Developer> getDeveloper();
    Developer addData(Developer developer);
}

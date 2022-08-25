package demoapi.javauseproject.dao;

import demoapi.javauseproject.entity.Developer;
import org.springframework.data.repository.CrudRepository;

public interface Dao extends CrudRepository<Developer, Integer> {
}

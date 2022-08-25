package demoapi.javauseproject.dao;

import demoapi.javauseproject.entity.Developer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;


@Repository
public interface Dao extends CrudRepository<Developer,Integer> {

}

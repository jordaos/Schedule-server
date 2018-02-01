package br.com.mv.repository;

import br.com.mv.entity.People;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*")
public interface PeopleRepository extends CrudRepository<People, Integer> {

}


package br.com.mv.repository;

import br.com.mv.entity.Phone;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*")
public interface PhoneRepository extends CrudRepository<Phone, Integer> {

}

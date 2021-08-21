package co.edu.unbosque.model.dao;

import co.edu.unbosque.model.persistence.PersonaDTO;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonaDAO extends MongoRepository<PersonaDTO, Long> {

}

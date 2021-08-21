package co.edu.unbosque.model.service;

import co.edu.unbosque.model.persistence.PersonaDTO;

import java.util.ArrayList;

public interface PersonaService {
    ArrayList<PersonaDTO> listAll();
    void save(PersonaDTO persona);
    void delete(PersonaDTO persona);
    PersonaDTO findPersona(PersonaDTO persona);
}

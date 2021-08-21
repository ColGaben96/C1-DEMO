package co.edu.unbosque.model.implementation;

import co.edu.unbosque.model.dao.PersonaDAO;
import co.edu.unbosque.model.persistence.PersonaDTO;
import co.edu.unbosque.model.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

public class PersonaImpl implements PersonaService {

    @Autowired
    private PersonaDAO persona;

    @Override
    @Transactional(readOnly = true)
    public ArrayList<PersonaDTO> listAll() {
        return (ArrayList<PersonaDTO>) this.persona.findAll();
    }

    @Override
    @Transactional
    public void save(PersonaDTO persona) {
        this.persona.save(persona);
    }

    @Override
    @Transactional
    public void delete(PersonaDTO persona) {
        this.persona.delete(persona);
    }

    @Override
    @Transactional(readOnly = true)
    public PersonaDTO findPersona(PersonaDTO persona) {
        return this.persona.findById(persona.getId()).orElse(null);
    }
}

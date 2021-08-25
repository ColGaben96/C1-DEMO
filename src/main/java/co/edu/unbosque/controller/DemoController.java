package co.edu.unbosque.controller;

import co.edu.unbosque.model.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @Autowired
    private PersonaService personaService;

    @GetMapping("/")
    public String getPersonas() {
        return "index";
    }
}

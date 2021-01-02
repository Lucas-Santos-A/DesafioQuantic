package io.github.LucasSantosA.desafio.desafio.controller;

import io.github.LucasSantosA.desafio.desafio.model.entity.Agenda;
import io.github.LucasSantosA.desafio.desafio.services.AgendaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/agenda")
public class AgendaController {

    @Autowired
    private AgendaServices agendaServices;

    @PostMapping
    public void saveAgendaFromAPI(){
        this.agendaServices.saveAgendaFromAPI();
    }

    @GetMapping
    public List<Agenda> getAgendaFromDatabase(){
        return this.agendaServices.getAgendaFromDatabase();
    }
}

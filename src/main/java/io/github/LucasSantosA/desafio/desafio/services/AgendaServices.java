package io.github.LucasSantosA.desafio.desafio.services;

import io.github.LucasSantosA.desafio.desafio.model.entity.Agenda;
import io.github.LucasSantosA.desafio.desafio.model.entity.Response;
import io.github.LucasSantosA.desafio.desafio.repository.AgendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class AgendaServices {

    @Autowired
    private WebClient.Builder webClientBuilder;

    @Autowired
    private AgendaRepository agendaRepository;

    public void saveAgendaFromAPI(){
       Response response = webClientBuilder.build()
                .get()
                .uri("https://ics.multieditoras.com.br/ics/agenda/1/2017/12?chave=TFACS-PD6L7-WG5ZF-Q9WU9&cliente=10378405&compacto=0&formato=json")
                .retrieve()
                .bodyToMono(Response.class)
                .block();

       List<Agenda> agendaList = response.getAgenda();

       agendaList.forEach((agenda -> {
           agendaRepository.save(agenda);
       }));
    }

    public List<Agenda> getAgendaFromDatabase(){
        return this.agendaRepository.findAll();
    }


}

package io.github.LucasSantosA.desafio.desafio;

import io.github.LucasSantosA.desafio.desafio.controller.AgendaController;
import io.github.LucasSantosA.desafio.desafio.model.entity.Agenda;
import io.github.LucasSantosA.desafio.desafio.services.AgendaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@SpringBootApplication
@Configuration
public class DesafioApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(
			@Autowired AgendaController agendaController
			){
		return args -> {
			agendaController.saveAgendaFromAPI();
			List<Agenda> agendaList = agendaController.getAgendaFromDatabase();

			System.out.printf("\n%-10s %-10s %-30s %-10s\n", "Hash", "Id", "Nome", "Esfera");

			agendaList.forEach((agenda) -> {
				System.out.printf("%-10s %-10s %-30s %-10s\n", "N/A", agenda.getId(), agenda.getNome(), agenda.getEsfera());
			});
		};
	}
}

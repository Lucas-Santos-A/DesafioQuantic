package io.github.LucasSantosA.desafio.desafio.repository;

import io.github.LucasSantosA.desafio.desafio.model.entity.Agenda;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AgendaRepository extends MongoRepository<Agenda, Integer> {

}

package io.github.LucasSantosA.desafio.desafio.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter@Setter
@NoArgsConstructor
public class Response {
    private String versao;
    private List<Agenda> agenda;
}

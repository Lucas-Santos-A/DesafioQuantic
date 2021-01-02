package io.github.LucasSantosA.desafio.desafio.model.entity;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Getter @Setter
@NoArgsConstructor
@Document
public class Agenda {

    @JsonAlias({"@id"})
    @Id
    private Integer id;

    private String nome;

    private String esfera;

}

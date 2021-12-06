package com.helena.aula29.persistence.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "TIMES")
@Getter
@Setter
public class TimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String nome;
    private String cidade;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "jogadores")
    private List<JogadorEntity> jogadores;
}

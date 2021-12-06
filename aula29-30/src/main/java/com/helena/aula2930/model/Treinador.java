package com.helena.aula2930.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Treinador {
    @Id
    @SequenceGenerator(name = "treinador_sequencia", sequenceName = "treinador_sequencia", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "treinador_sequencia")
    private Integer id;
    private String nome;
    @OneToMany(mappedBy = "treinador")
    private Set<Jogador> jogadores = new HashSet<>();

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(Set<Jogador> jogadores) {
        this.jogadores = jogadores;
    }
}

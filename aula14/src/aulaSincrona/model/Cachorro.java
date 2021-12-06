package aulaSincrona.model;

import java.io.Serializable;

public class Cachorro implements Serializable {
    private String nome;
    private Integer idade;

    public Cachorro(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }
}

package model;

import java.sql.Date;
import java.time.LocalDate;

public class Paciente {
    private Integer id;
    private String nome;
    private String sobrenome;
    private String rg;
    private LocalDate dataCadastro = LocalDate.now();
    private Endereco endereco;

    public Paciente(String nome, String sobrenome, String rg, Endereco endereco) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.endereco = endereco;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}

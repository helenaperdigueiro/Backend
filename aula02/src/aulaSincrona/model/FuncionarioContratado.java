package aula02.model;

public class FuncionarioContratado extends Funcionario{
    private Integer numeroHoras;
    private Double valorHora;

    public FuncionarioContratado(String nome, String sobrenome, String contaBancaria, Tipo tipo, Integer numeroHoras, Double valorHora) {
        super(nome, sobrenome, contaBancaria, tipo);
        this.numeroHoras = numeroHoras;
        this.valorHora = valorHora;
    }

    public Integer getNumeroHoras() {
        return numeroHoras;
    }

    public void setNumeroHoras(Integer numeroHoras) {
        this.numeroHoras = numeroHoras;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }
}

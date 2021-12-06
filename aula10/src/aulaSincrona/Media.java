package aulaSincrona;

import java.util.ArrayList;
import java.util.List;

public class Media {

    private Integer[] listaDeNumeros;
    private Double media;

    public Media(Integer[] listaDeNumeros) {
        this.listaDeNumeros = listaDeNumeros;
    }

    public Double calcularMedia() {
        Integer tamanho = this.listaDeNumeros.length;
        Integer soma = 0;

        for(Integer numero: this.listaDeNumeros) {
            soma += numero;
        }

        double media = (soma / (double)tamanho);
        return media;
    }

    public Integer[] getListaDeNumeros() {
        return listaDeNumeros;
    }

    public void setListaDeNumeros(Integer[] listaDeNumeros) {
        this.listaDeNumeros = listaDeNumeros;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }
}

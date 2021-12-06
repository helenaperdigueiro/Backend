package aula01.mesa.facade;

import aula01.mesa.interfac.IBuscador;
import aula01.mesa.subsystem.ProvedorHotel;
import aula01.mesa.subsystem.ProvedorVoo;

import java.util.Date;

public class Buscador implements IBuscador {
    private ProvedorVoo provedorVoo = new ProvedorVoo();
    private ProvedorHotel provedorHotel = new ProvedorHotel();

    public Buscador(ProvedorVoo provedorVoo, ProvedorHotel provedorHotel) {
        this.provedorVoo = provedorVoo;
        this.provedorHotel = provedorHotel;
    }

    @Override
    public String buscarViagem(Date dataInicial, Date dataFinal, String origem, String destino) {
        return "Achamos um voo da " + provedorVoo.buscarVoo(dataInicial, dataFinal, origem, destino) +
                " e estadia no hotel 5 estrelas " + provedorHotel.buscarHotel(dataInicial, dataFinal, destino);
    }
}

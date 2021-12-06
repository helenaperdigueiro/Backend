package aula01.mesa.interfac;

import java.util.Date;

public interface IBuscador {
    String buscarViagem(Date dataInicial, Date dataFinal, String origem, String destino);
}

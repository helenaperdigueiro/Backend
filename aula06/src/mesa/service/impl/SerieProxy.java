package mesa.service.impl;

import mesa.service.ISerieService;
import mesa.service.SerieNaoHabilitadaException;

public class SerieProxy implements ISerieService {
    private int qtdViews = 0;
    private SerieService serie = new SerieService();

    @Override
    public String getSerie(String nome) throws SerieNaoHabilitadaException {
        if(qtdViews < 5) {
            qtdViews++;
            System.out.println(qtdViews);
            return serie.getSerie(nome);
        } else {
            throw new SerieNaoHabilitadaException("Excede o número de reproduções");
        }
    }
}

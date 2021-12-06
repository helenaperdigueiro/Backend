package mesa.service.impl;

import mesa.service.ISerieService;

public class SerieService implements ISerieService {

    @Override
    public String getSerie(String nome) {
        String link = "www." + nome + ".com.br";
        return link;
    }
}

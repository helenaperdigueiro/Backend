package mesa.service;

public interface ISerieService {
    String getSerie(String nome) throws SerieNaoHabilitadaException;
}

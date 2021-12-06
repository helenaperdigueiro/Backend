package mesa;

import mesa.service.SerieNaoHabilitadaException;
import mesa.service.impl.SerieProxy;

public class Main {
    public static void main(String[] args) {
        SerieProxy serie = new SerieProxy();
        try {
            System.out.println(serie.getSerie("serie01"));
            System.out.println(serie.getSerie("serie02"));
            System.out.println(serie.getSerie("serie03"));
            System.out.println(serie.getSerie("serie04"));
            System.out.println(serie.getSerie("serie05"));
            System.out.println(serie.getSerie("serie06"));
        } catch (SerieNaoHabilitadaException exception) {
            System.out.println(exception.getMessage());
        }
    }
}

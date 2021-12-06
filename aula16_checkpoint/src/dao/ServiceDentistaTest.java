package dao;

import model.Dentista;
import org.apache.log4j.PropertyConfigurator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServiceDentistaTest {
    Dentista dentista1;
    Dentista dentista2;
    Dentista dentista3;
    ServidorDentista servidorDentista;

    @BeforeEach
    void doBefore() {
        PropertyConfigurator.configure("log4j.properties");

        servidorDentista = new ServidorDentista();
        servidorDentista.create();

        dentista1 = new Dentista("001", "Maria", "Silva");
        dentista2 = new Dentista("002", "Joao", "Silva");
        dentista3 = new Dentista("003", "Pedro", "Silva");
        servidorDentista.insert(dentista1);
        servidorDentista.insert(dentista2);
        servidorDentista.insert(dentista3);
    }

    @Test
    void selectAll() {
        ArrayList<String> dentistasInfoSelectAll = servidorDentista.selectAll();
        ArrayList<String> dentistasInfo = new ArrayList<>();

        String dentistaInfo1 = String.format("\n***** \n%s \n%s \n%s \n%s \n*****",
                dentista1.getId(),
                dentista1.getNumeroMatricula(),
                dentista1.getNome(),
                dentista1.getSobrenome());
        String dentistaInfo2 = String.format("\n***** \n%s \n%s \n%s \n%s \n*****",
                dentista2.getId(),
                dentista2.getNumeroMatricula(),
                dentista2.getNome(),
                dentista2.getSobrenome());
        String dentistaInfo3 = String.format("\n***** \n%s \n%s \n%s \n%s \n*****",
                dentista3.getId(),
                dentista3.getNumeroMatricula(),
                dentista3.getNome(),
                dentista3.getSobrenome());
        dentistasInfo.add(dentistaInfo1);
        dentistasInfo.add(dentistaInfo2);
        dentistasInfo.add(dentistaInfo3);

        assertEquals(dentistasInfo, dentistasInfoSelectAll);
    }

}

package mesa;

import mesa.model.Roupa;
import mesa.model.Tamanho;
import mesa.model.Tipo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoupaFactoryTest {
    List<Roupa> lista = new ArrayList<>();
    RoupaFactory factory = new RoupaFactory();

    @BeforeEach
    void doBefore() {
        lista.add(factory.buscarRoupa(Tamanho.P, Tipo.CALCA, true, true));
        lista.add(factory.buscarRoupa(Tamanho.M, Tipo.CALCA, true, true));
        lista.add(factory.buscarRoupa(Tamanho.M, Tipo.CALCA, true, true));
        lista.add(factory.buscarRoupa(Tamanho.P, Tipo.CAMISA, true, true));
        lista.add(factory.buscarRoupa(Tamanho.M, Tipo.CAMISA, true, true));
        lista.add(factory.buscarRoupa(Tamanho.M, Tipo.CAMISA, true, true));
    }

    @Test
    void getRoupa() {
        assertEquals(Tamanho.P, lista.get(0).getTamanho());
    }

    @Test
    void getContador() {
        assertEquals(4, RoupaFactory.getContador());
    }
    //teste
}

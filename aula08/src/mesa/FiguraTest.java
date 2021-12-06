package mesa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.text.DecimalFormat;

public class FiguraTest {
    @Test
    void perimetroQuadrado() {
        Quadrado quadrado = new Quadrado(5.0);
        Double perimetro = quadrado.calcularPerimetro();
        assertEquals(20.0, perimetro);
    }
    @Test
    void perimetroCirculo() {
        DecimalFormat formatador = new DecimalFormat("#.#");
        Circulo circulo = new Circulo(5.0);
        Double perimetro = circulo.calcularPerimetro();
        perimetro = Double.valueOf(formatador.format(perimetro));
        assertEquals(31.4, perimetro);
    }
}

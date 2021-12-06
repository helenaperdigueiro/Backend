package aulaSincrona;

import aulaSincrona.dao.ServidorH2;
import aulaSincrona.model.Medicamento;
import org.apache.log4j.PropertyConfigurator;

public class Main {
    public static void main(String[] args) {
//        CREATE TABLE Medicamento (id INT PRIMARY KEY, codigoNumerico VARCHAR(255) NOT NULL, nome VARCHAR(255) NOT NULL, laboratorio VARCHAR(255) NOT NULL,  quantidade INT NOT NULL, preco DOUBLE NOT NULL)

        PropertyConfigurator.configure("log4j.properties");

        Medicamento medicamento = new Medicamento(1, "12345", "Dorflex", "NeoQuimica", 15, 8.5);
        ServidorH2 servidorH2 = new ServidorH2();

        servidorH2.insert(medicamento);
        servidorH2.select(medicamento.getId());
        servidorH2.selectAll();
        servidorH2.delete(medicamento.getId());
    }
}

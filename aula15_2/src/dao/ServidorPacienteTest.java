package dao;

import model.Endereco;
import model.Paciente;
import org.apache.log4j.PropertyConfigurator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServidorPacienteTest {
    Paciente paciente;
    Paciente paciente2;
    ServidorPaciente servidorPaciente;

    @BeforeEach
    void doBefore() {
        PropertyConfigurator.configure("log4j.properties");
        ServidorEndereco servidorEndereco = new ServidorEndereco();
        servidorEndereco.create();
        Endereco endereco = new Endereco("Primavera", "1", "Sao Paulo", "Sao Paulo");
        Endereco endereco2 = new Endereco("Outono", "1", "Maceio", "Alagoas");
        servidorEndereco.insert(endereco);
        servidorEndereco.insert(endereco2);

        servidorPaciente = new ServidorPaciente();
        servidorPaciente.create();
        paciente = new Paciente("Silvana", "Silva", "123456", endereco);
        paciente2 = new Paciente("Pedro", "Souza", "123456", endereco2);

        servidorPaciente.selectAll();
    }
    @Test
    void delete() {
        servidorPaciente.insert(paciente);
        servidorPaciente.insert(paciente2);
        servidorPaciente.select(1);
        servidorPaciente.delete(1);

        assertEquals("Id não existe no banco", servidorPaciente.select(1));
    }
}

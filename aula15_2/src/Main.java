import dao.ServidorEndereco;
import dao.ServidorPaciente;
import model.Endereco;
import model.Paciente;
import org.apache.log4j.PropertyConfigurator;

public class Main {
    public static void main(String[] args) {
        PropertyConfigurator.configure("log4j.properties");

        ServidorPaciente servidorPaciente = new ServidorPaciente();
        servidorPaciente.create();
        ServidorEndereco servidorEndereco = new ServidorEndereco();
        servidorEndereco.create();
        Endereco endereco = new Endereco("Primavera", "1", "Sao Paulo", "Sao Paulo");
        servidorEndereco.insert(endereco);

        Paciente carol = new Paciente("Carol", "Hakamada", "123456", endereco);
        servidorPaciente.insert(carol);
        servidorEndereco.update(carol.getEndereco().getId(), "rua", "Verao");

        Endereco endereco2 = new Endereco("Outono", "1", "Maceio", "Alagoas");
        servidorEndereco.insert(endereco2);

        Paciente renata = new Paciente("Renata", "Leal", "123456", endereco2);
        servidorPaciente.insert(renata);

        servidorEndereco.select(renata.getEndereco().getId());
        servidorPaciente.select(renata.getId());

        servidorPaciente.selectAll();
        servidorEndereco.selectAll();

    }
}

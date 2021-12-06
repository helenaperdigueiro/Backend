import dao.ServidorDentista;
import model.Dentista;
import org.apache.log4j.PropertyConfigurator;

public class Main {
    public static void main(String[] args) {
        PropertyConfigurator.configure("log4j.properties");

        ServidorDentista servidorDentista = new ServidorDentista();
        servidorDentista.create();

        Dentista dentista1 = new Dentista("001", "Maria", "Silva");
        Dentista dentista2 = new Dentista("002", "Joao", "Silva");
        Dentista dentista3 = new Dentista("003", "Pedro", "Silva");
        servidorDentista.insert(dentista1);
        servidorDentista.insert(dentista2);
        servidorDentista.insert(dentista3);
        System.out.println(dentista1.getId());
        System.out.println(dentista2.getId());
        System.out.println(dentista3.getId());
        servidorDentista.selectAll();

    }
}

package mesa;

import aulaSincrona.model.Cachorro;
import mesa.model.Contato;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Você deve manter uma lista de contatos em um arquivo. Os contatos possuem
//        um nome, e-mail e telefone. Para fazer isso, sugerimos que você utilize o
//        método main para salvar a coleção de contatos em um arquivo e, em seguida,
//        recupere o conteúdo do arquivo para outra coleção e exiba a lista de contatos
        //

        ArrayList<Contato> contatos = new ArrayList<>();

        Contato contato1 = new Contato("Renata", "renata@gmail.com.br", "123456789");
        Contato contato2 = new Contato("Flavio", "flavio@gmail.com.br", "123456789");
        Contato contato3 = new Contato("Carolina", "carolina@gmail.com.br", "123456789");
        Contato contato4 = new Contato("Adryana", "adryana@gmail.com.br", "123456789");
        Contato contato5 = new Contato("Ailla", "ailla@gmail.com.br", "123456789");
        Contato contato6 = new Contato("Clarissa", "clarissa@gmail.com.br", "123456789");
        Contato contato7 = new Contato("Helena", "helena@gmail.com.br", "123456789");

        contatos.add(contato1);
        contatos.add(contato2);
        contatos.add(contato3);
        contatos.add(contato4);
        contatos.add(contato5);
        contatos.add(contato6);
        contatos.add(contato7);

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("ListaContatos.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(contatos);
        } catch (Exception e) {
            e.printStackTrace();
        }

        List<Contato> contatos2 = new ArrayList<>();

        try {
            FileInputStream fileInputStream = new FileInputStream("ListaContatos.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            contatos2 = (ArrayList) objectInputStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }

        for(Contato contato: contatos2) {
            System.out.println(String.format("Nome: %s Email: %s Telefone: %s",
                    contato.getNome(), contato.getEmail(), contato.getTelefone()));
        }
    }
}

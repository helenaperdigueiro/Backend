package aulaSincrona;

import aulaSincrona.model.Cachorro;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Cachorro> cachorros = new ArrayList<>();

        Cachorro dog1 = new Cachorro("Baleia", 3);
        Cachorro dog2 = new Cachorro("Kal", 4);
        Cachorro dog3 = new Cachorro("Meg", 11);

        cachorros.add(dog1);
        cachorros.add(dog2);
        cachorros.add(dog3);

        //Criar um arquivo
        FileOutputStream fileOut;

        try {
            fileOut = new FileOutputStream("ListaCachorros.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOut);
            objectOutputStream.writeObject(cachorros);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }


        //Para ler um arquivo
        List<Cachorro> cachorros2 = null;
        FileInputStream fileInput;

        try {
            fileInput = new FileInputStream("ListaCachorros.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInput);
            cachorros2 = (ArrayList) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (Cachorro dog: cachorros2) {
            System.out.println(String.format("Nome: %s \nIdade: %s", dog.getNome(), dog.getIdade()));
        }
    }
}

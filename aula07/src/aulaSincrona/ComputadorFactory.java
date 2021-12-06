package aulaSincrona;

import aulaSincrona.model.Computador;

import java.util.HashMap;
import java.util.Map;

public class ComputadorFactory {
    private static Map<String, Computador> flyweight = new HashMap<>();

    public Computador buscarComputador(Integer ram, Integer hd) {
        String id = "ram:" + ram + "hd:" + hd;
        if(!flyweight.containsKey(id)) {
            flyweight.put(id, new Computador(ram, hd));
            System.out.println("Computador criado!");
        } else {
            System.out.println("Esse computador ja existe!");
        }
        return flyweight.get(id);
    }
}

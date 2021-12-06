package mesa;

import mesa.model.Roupa;
import mesa.model.Tamanho;
import mesa.model.Tipo;

import java.util.HashMap;
import java.util.Map;

public class RoupaFactory {
    private static Integer contador = 0;
    private static Map<String, Roupa> flyweight = new HashMap<>();

    public Roupa buscarRoupa(Tamanho tamanho, Tipo tipo, boolean eNova, boolean eImportada) {
        String id = "tamanho:" + tamanho + "tipo:" + tipo;
        if(!flyweight.containsKey(id)) {
            flyweight.put(id, new Roupa(tamanho, tipo, eNova, eImportada));
            contador++;
            System.out.println("Roupa nova criada!");
            System.out.println(flyweight.get(id).toString());
        } else {
            System.out.println("Esta roupa ja existe!");
        }
        return flyweight.get(id);
    }

    public static Integer getContador() {
        return contador;
    }

    public static void setContador(Integer contador) {
        RoupaFactory.contador = contador;
    }

    public static Map<String, Roupa> getFlyweight() {
        return flyweight;
    }

    public static void setFlyweight(Map<String, Roupa> flyweight) {
        RoupaFactory.flyweight = flyweight;
    }
}

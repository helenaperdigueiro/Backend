package aulaSincrona.model;

public class Computador {

    private Integer ram;
    private Integer hd;
    private static Integer contador = 0;

    public Computador(Integer ram, Integer hd) {
        this.ram = ram;
        this.hd = hd;
        contador++;
        System.out.println(contador);
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getHd() {
        return hd;
    }

    public void setHd(Integer hd) {
        this.hd = hd;
    }

    public static Integer getContador() {
        return contador;
    }

    public static void setContador(Integer contador) {
        Computador.contador = contador;
    }

    @Override
    public String toString() {
        return "Computador{" +
                "ram=" + ram +
                ", hd=" + hd +
                '}';
    }
}

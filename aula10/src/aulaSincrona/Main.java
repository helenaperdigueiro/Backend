package aulaSincrona;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        PropertyConfigurator.configure("log4j.properties");

        Integer[] lista = {1,2,3,4};
        Media media = new Media(lista);
        media.setMedia(media.calcularMedia());

        if(media.getListaDeNumeros().length > 10) {
            logger.info("Lista de numero é maior que 10");
        } else if(media.getListaDeNumeros().length >= 5) {
            logger.info("Lista de numero é maior que 5");
        } else if(media.getListaDeNumeros().length < 5) {
            logger.info("Lista de numero é menor que 5");
        } else {
            logger.info("Lista de numero é vazia");
            return;
        }
        logger.info("A média é igual a " + media.getMedia());

    }
}
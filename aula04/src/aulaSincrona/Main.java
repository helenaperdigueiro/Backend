package aulaSincrona;

import aulaSincrona.model.Mail;
import aulaSincrona.service.CheckEmail;
import aulaSincrona.service.impl.Comercial;
import aulaSincrona.service.impl.Gerente;
import aulaSincrona.service.impl.Tecnico;

public class Main {
    public static void main(String[] args) {
        Mail mail = new Mail("lucas@hotmail.com", "tecnico@colmeia.com", "Spring Boot");

        String[] emailValidado = mail.getDestino().split("@");

        CheckEmail checkEmail;

        if(emailValidado[1].equals("colmeia.com")) {
            checkEmail = new Gerente().setProximoDestinatario(new Comercial().setProximoDestinatario(new Tecnico()));
        } else {
            checkEmail = new Tecnico();
        }

        checkEmail.processarEmail(mail, emailValidado[0]);
    }
}

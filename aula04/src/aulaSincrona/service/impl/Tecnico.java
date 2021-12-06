package aulaSincrona.service.impl;

import aulaSincrona.model.Mail;
import aulaSincrona.service.CheckEmail;

public class Tecnico extends CheckEmail {

    @Override
    public void processarEmail(Mail mail, String nomeDestinatario) {
        String[] arrayMail = mail.getDestino().split("@");

        if(nomeDestinatario.equals("tecnico") && arrayMail[1].equals("colmeia.com")) {
            System.out.println("Esse email é do tecnico e chegou ao seu destinatario");
        } else {
            System.out.println("Esse email é um SPAM");
        }
    }
}

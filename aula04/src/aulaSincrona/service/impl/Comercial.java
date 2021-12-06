package aulaSincrona.service.impl;

import aulaSincrona.model.Mail;
import aulaSincrona.service.CheckEmail;

public class Comercial extends CheckEmail {

    @Override
    public void processarEmail(Mail mail, String nomeDestinatario) {
        String[] arrayMail = mail.getDestino().split("@");

        if(nomeDestinatario.equals("comercial")) {
            System.out.println("Esse email é do comercial e chegou ao seu destinatario");
        } else {
            this.proximoDestinatario.processarEmail(mail, nomeDestinatario);
        }
    }
}

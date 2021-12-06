package aulaSincrona.service.impl;

import aulaSincrona.model.Mail;
import aulaSincrona.service.CheckEmail;

public class Gerente extends CheckEmail {

    @Override
    public void processarEmail(Mail mail, String nomeDestinatario) {

        if(nomeDestinatario.equals("gerente")) {
            System.out.println("Esse email é do gerente e chegou ao seu destinatario");
        } else {
            this.proximoDestinatario.processarEmail(mail, nomeDestinatario);
        }
    }
}

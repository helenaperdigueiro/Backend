package aulaSincrona.server.impl;

import aulaSincrona.model.Pessoa;
import aulaSincrona.server.IVacinacao;

import java.text.SimpleDateFormat;
import java.util.Date;

public class VacinacaoService implements IVacinacao {

    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    String dataAtualFormatada = formato.format(new Date());

    @Override
    public void vacinar(Pessoa pessoa) {
        System.out.println(pessoa.getNome() + " portador do RG " + pessoa.getRg() + " tomou a vacina " + pessoa.getVacina() + " no dia " + dataAtualFormatada);
    }
}

package aulaSincrona;

import aulaSincrona.model.Pessoa;
import aulaSincrona.server.IVacinacao;
import aulaSincrona.server.impl.VacinacaoProxy;
import aulaSincrona.server.impl.VacinacaoService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        Date data = formatoData.parse("14/10/2021");
//        String dataFormatada = formatoData.format(data);
//        System.out.println(dataFormatada);

        Pessoa pessoa = new Pessoa("Lucas", "Paglia", "123456", "H1N1", data);

        IVacinacao proxy = new VacinacaoProxy(new VacinacaoService());
        proxy.vacinar(pessoa);
    }
}

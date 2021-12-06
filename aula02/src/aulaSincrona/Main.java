package aula02;

import aula02.model.Funcionario;
import aula02.model.FuncionarioContratado;
import aula02.model.FuncionarioEfetivo;
import aula02.model.Tipo;
import aula02.service.PagamentoService;
import aula02.service.impl.CalculoSalarialContratado;
import aula02.service.impl.CalculoSalarialEfetivo;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, PagamentoService> serviceMap = Map.of("Contratado", new CalculoSalarialContratado(), "Efetivo", new CalculoSalarialEfetivo());

        Funcionario efetivo = new FuncionarioEfetivo("Jose", "Silva", "123456", Tipo.EFETIVO, 2400.35);
        Funcionario contratado = new FuncionarioContratado("Maria", "Gomes", "987456", Tipo.CONTRATADO, 176, 35.0);

        PagamentoService service = serviceMap.get("Efetivo");
        service.pagar(efetivo);
        service = serviceMap.get("Contratado");
        service.pagar(contratado);

    }
}

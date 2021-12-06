package com.digitalhouse.aula2;

import com.digitalhouse.aula2.model.Funcionario;
import com.digitalhouse.aula2.model.FuncionarioContratado;
import com.digitalhouse.aula2.model.FuncionarioEfetivo;
import com.digitalhouse.aula2.model.Tipo;
import com.digitalhouse.aula2.service.PagamentoService;
import com.digitalhouse.aula2.service.impl.CalculoSalarialContratado;
import com.digitalhouse.aula2.service.impl.CalculoSalarialEfetivo;

import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, PagamentoService> serviceMap = Map.of("Contratado", new CalculoSalarialContratado(), "Efetivo", new CalculoSalarialEfetivo());

        Funcionario efetivo = new FuncionarioEfetivo("Jose", "Silva", "251685", Tipo.EFETIVO, 2400.35);
        Funcionario contratado = new FuncionarioContratado("Maria", "Gomes", "2625158", Tipo.CONTRATADO, 176, 35.00);

        PagamentoService service = serviceMap.get("Efetivo");
        service.pagar(efetivo);
        System.out.println("---------------------------------");
        service = serviceMap.get("Contratado");
        service.pagar(contratado);

    }
}

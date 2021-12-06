package aula02.service.impl;

import aula02.model.Funcionario;
import aula02.model.FuncionarioContratado;
import aula02.service.PagamentoService;

public class CalculoSalarialContratado extends PagamentoService {

    @Override
    protected Double calcularSalario(Funcionario funcionario) {
        FuncionarioContratado contratado = ((FuncionarioContratado) funcionario);


        return contratado.getValorHora() * contratado.getNumeroHoras();
    }
}

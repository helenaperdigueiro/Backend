package aula02.service.impl;

import aula02.model.Funcionario;
import aula02.model.FuncionarioEfetivo;
import aula02.service.PagamentoService;

public class CalculoSalarialEfetivo extends PagamentoService {

    @Override
    protected Double calcularSalario(Funcionario funcionario) {
        FuncionarioEfetivo efetivo = ((FuncionarioEfetivo) funcionario);
        Double salario = efetivo.getSalarioBase() * (100 - efetivo.getDesconto()/100 + efetivo.getBeneficio()/100);
        return salario;
    }
}

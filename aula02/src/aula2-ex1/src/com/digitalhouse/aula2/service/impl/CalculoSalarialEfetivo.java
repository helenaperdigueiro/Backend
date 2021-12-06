package com.digitalhouse.aula2.service.impl;

import com.digitalhouse.aula2.model.Funcionario;
import com.digitalhouse.aula2.model.FuncionarioEfetivo;
import com.digitalhouse.aula2.service.PagamentoService;

public class CalculoSalarialEfetivo extends PagamentoService {
    @Override
    protected Double calcularSalario(Funcionario funcionario) {
        FuncionarioEfetivo efetivo = ((FuncionarioEfetivo) funcionario);
        Double salario = efetivo.getSalarioBase(); // Salario Base
        salario = salario - (efetivo.getSalarioBase() * efetivo.getDesconto()/100); // Salario - Descontos
        salario += (salario * efetivo.getBeneficio()/100); // Salario(Com descontos) + besneficios

        return salario;
    }
}

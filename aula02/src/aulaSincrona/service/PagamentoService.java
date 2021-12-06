package aula02.service;

import aula02.model.Funcionario;
import aula02.model.Tipo;

import java.text.DecimalFormat;

public abstract class PagamentoService {
    public void pagar(Funcionario funcionario){

        funcionario.setSalarioFinal(calcularSalario(funcionario));
        Double salarioFormatado = funcionario.getSalarioFinal();
        DecimalFormat formato = new DecimalFormat("#.##");
        salarioFormatado = Double.valueOf(formato.format(salarioFormatado));

        System.out.println(depositarSalario(funcionario.getContaBancaria(), salarioFormatado));
        System.out.println(emitirComprovante((funcionario.getTipo())));
    }

    private String depositarSalario(String conta, Double salarioFinal) {
        return "Deposito do salario " + salarioFinal + " efetuado na conta " + conta;
    }

    private String emitirComprovante(Tipo tipo) {
        if(tipo == Tipo.CONTRATADO) {
            return "Recibo enviado por email";
        } else if(tipo == Tipo.EFETIVO) {
            return "Recibo impresso com sucesso";
        }
        return "Erro ao emitir o recibo";
    }

    protected abstract Double calcularSalario(Funcionario funcionario);
}

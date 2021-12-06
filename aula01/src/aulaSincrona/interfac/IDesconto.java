package aula01.aulaSincrona.interfac;

import aula01.aulaSincrona.modal.Cartao;
import aula01.aulaSincrona.modal.Produto;

public interface IDesconto {
    Double calcularDesconto(Cartao cartao, Produto produto, Integer quantidade);

}

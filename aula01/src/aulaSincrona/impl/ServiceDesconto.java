package aula01.aulaSincrona.impl;

import aula01.aulaSincrona.exapi.ApiCartao;
import aula01.aulaSincrona.exapi.ApiProduto;
import aula01.aulaSincrona.exapi.ApiQuantidade;
import aula01.aulaSincrona.interfac.IDesconto;
import aula01.aulaSincrona.modal.Cartao;
import aula01.aulaSincrona.modal.Produto;

public class ServiceDesconto implements IDesconto {
    private ApiCartao apiCartao = new ApiCartao();
    private ApiProduto apiProduto = new ApiProduto();
    private ApiQuantidade apiQuantidade = new ApiQuantidade();



    @Override
    public Double calcularDesconto(Cartao cartao, Produto produto, Integer quantidade) {
        Double desconto = 0.0;
        desconto += apiCartao.checkDesconto(cartao.getBanco())
                + apiProduto.checkDesconto(produto.getTipo())
                + apiQuantidade.checkDesconto(quantidade);
        return desconto;
    }
}

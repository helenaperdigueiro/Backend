package model;

public class Estagiario extends Vendedor{
    public Estagiario(String nome) {
        super.setNome(nome);
    }

    @Override
    public void adicionarPontosVenda() {
        Integer pontosAtualizados = super.getPontos() + 5;
        super.setPontos(pontosAtualizados);
    }

    @Override
    public void calcularPontosAnosEmpresa() {
        // Esse vendedor ainda não é pontuado de acordo com tempo de casa.
    }

    @Override
    public void recategorizar() {
        if(super.getPontosTotais() < 50) {
            super.setCategoria(Categoria.ESTAGIARIO_NOVATO);
        }
        if(super.getPontosTotais() >= 50) {
            super.setCategoria(Categoria.ESTAGIARIO_EXPERIENTE);
        }
    }
}

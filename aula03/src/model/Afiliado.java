package model;

public class Afiliado extends Vendedor{
    public Afiliado(String nome) {
        super.setNome(nome);
    }

    @Override
    public void adicionarPontosVenda() {
        Integer pontosAtualizados = super.getPontos() + 15;
        super.setPontos(pontosAtualizados);
    }

    @Override
    public void calcularPontosAnosEmpresa() {
        // Esse vendedor ainda não é pontuado de acordo com tempo de casa.
    }

    @Override
    public void recategorizar() {
        if(super.getPontosTotais() < 20) {
            super.setCategoria(Categoria.NOVATO);
        }
        if(super.getPontosTotais() <= 30) {
            super.setCategoria(Categoria.APRENDIZ);
        }
        if(super.getPontosTotais() <= 40) {
            super.setCategoria(Categoria.BOM);
        }
        if(super.getPontosTotais() > 40) {
            super.setCategoria(Categoria.MESTRE);
        }
    }
}

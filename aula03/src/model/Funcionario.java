package model;

public class Funcionario extends Vendedor {
    public Funcionario(String nome) {
        super.setNome(nome);
    }

    @Override
    public void adicionarPontosVenda() {
        Integer pontosAtualizados = super.getPontos() + 5;
        super.setPontos(pontosAtualizados);
    }

    @Override
    public void calcularPontosAnosEmpresa() {
        Integer pontosAnosEmpresa = super.getPontos() + super.getAnosEmpresa() * 5;
        super.setPontosAnosEmpresa(pontosAnosEmpresa);
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

    private void adicionarPontosNovoAfiliado() {
        Integer pontosAtualizados = super.getPontos() + 10;
        super.setPontos(pontosAtualizados);
    }

    public Afiliado adicionarAfiliado(String nome) {
        adicionarPontosNovoAfiliado();
        return new Afiliado(nome);
    }
}

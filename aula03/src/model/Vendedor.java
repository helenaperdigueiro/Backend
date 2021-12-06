package model;

public abstract class Vendedor {
    private String nome;
    private Integer pontos = 0;
    private Categoria categoria;
    private Integer anosEmpresa;
    private Integer pontosAnosEmpresa = 0;
    private Integer pontosTotais = 0;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPontos() {
        return pontos;
    }

    public void setPontos(Integer pontos) {
        this.pontos = pontos;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Integer getAnosEmpresa() {
        return anosEmpresa;
    }

    public void setAnosEmpresa(Integer anosEmpresa) {
        this.anosEmpresa = anosEmpresa;
    }

    public Integer getPontosAnosEmpresa() {
        return pontosAnosEmpresa;
    }

    public void setPontosAnosEmpresa(Integer pontosAnosEmpresa) {
        this.pontosAnosEmpresa = pontosAnosEmpresa;
    }

    public Integer getPontosTotais() {
        return pontosTotais;
    }

    public void setPontosTotais(Integer pontosTotais) {
        this.pontosTotais = pontosTotais;
    }

    public String vender() {
        this.adicionarPontosVenda();
        return "Uma venda foi realizada!";
    }

    public abstract void adicionarPontosVenda();

    public abstract void calcularPontosAnosEmpresa();

    public abstract void recategorizar();

    public void calcularPontosTotais() {
        calcularPontosAnosEmpresa();
        this.pontosTotais = this.pontos + this.pontosAnosEmpresa;
    }

    public void mostrarCategoria() {
        calcularPontosTotais();
        recategorizar();
        System.out.println(String.format("%s tem um total de %s pontos e categoriza como vendedor %s",
                this.nome, this.pontosTotais, this.categoria));
    }
}
